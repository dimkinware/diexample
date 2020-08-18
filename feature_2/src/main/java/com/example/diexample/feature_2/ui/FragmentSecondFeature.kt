package com.example.diexample.feature_2.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.diexample.analytics.Adjust
import com.example.diexample.di.findComponentDependencies
import com.example.diexample.feature_2.FeatureSecondInteractor
import com.example.diexample.feature_2.FeatureSecondRepo
import com.example.diexample.feature_2.R
import com.example.diexample.feature_2.di.DaggerFeatureSecondComponent
import com.example.diexample.feature_2.di.FeatureSecondModule
import com.example.diexample.network.CoreApi
import javax.inject.Inject

class FragmentSecondFeature: Fragment() {

    @Inject
    lateinit var coreApi: CoreApi
    @Inject
    lateinit var adjust: Adjust
    @Inject
    lateinit var interactor: FeatureSecondInteractor

    @Inject
    internal lateinit var repo: FeatureSecondRepo

    private lateinit var text: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second_feature, container, false).also {
            text = it.findViewById(R.id.text)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initDependencies()
        Toast.makeText(context, repo.getValue2(), Toast.LENGTH_LONG).show()
        adjust.track("View ${this::class.java} created")
    }

    private fun initDependencies() {
        DaggerFeatureSecondComponent.factory()
            .create(
                dependencies = findComponentDependencies(),
                featureSecondModule = FeatureSecondModule()
            ).inject(this)
    }
}