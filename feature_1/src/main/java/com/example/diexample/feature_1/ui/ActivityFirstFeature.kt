package com.example.diexample.feature_1.ui

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.diexample.di.findComponentDependencies
import com.example.diexample.feature_1.R
import com.example.diexample.feature_1.di.DaggerFeatureFirstComponent
import com.example.diexample.feature_1.di.FeatureFirstModule
import com.example.diexample.feature_1.viewmodel.FeatureFirstViewModel
import com.example.diexample.feature_1.viewmodel.FeatureFirstViewState
import com.example.diexample.feature_2.FeatureSecondInteractor
import com.example.diexample.feature_2.FeatureSecondStarter
import javax.inject.Inject

class ActivityFirstFeature : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: FeatureFirstViewModel

    @Inject
    lateinit var featureSecondStarter: FeatureSecondStarter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_1)

        injectDependencies()

        viewModel = viewModelFactory.create(FeatureFirstViewModel::class.java).apply {
            viewState.observe(this@ActivityFirstFeature, Observer(::receiveViewState))
            openScreenAction.observe(this@ActivityFirstFeature, Observer { openFeatureSecondScreen() })
        }
    }

    private fun injectDependencies() {
        DaggerFeatureFirstComponent.factory()
            .create(
                dependencies = findComponentDependencies(),
                featureFirstModule = FeatureFirstModule()
            ).inject(this)
    }

    private fun receiveViewState(viewState: FeatureFirstViewState) {
        val container = findViewById<LinearLayout>(R.id.container)
        viewState.buttons.forEach { value ->
            container.addView(
                AppCompatButton(this).apply {
                    text = value
                    setOnClickListener { receiveClick(value) }
                },
                LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
            )
        }
    }

    private fun openFeatureSecondScreen() {
        featureSecondStarter.start(this)
    }

    private fun receiveClick(value: String) {
        viewModel.onButtonClick(value)
    }
}