package com.example.diexample.feature_1.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.diexample.analytics.GoogleAnalytics
import com.example.diexample.feature_2.FeatureSecondInteractor
import com.example.diexample.livedata.SingleLiveEvent
import timber.log.Timber

class FeatureFirstViewModel(
    private val googleAnalytics: GoogleAnalytics,
    private val featureSecondInteractor: FeatureSecondInteractor
) : ViewModel() {

    val viewState = MutableLiveData<FeatureFirstViewState>()
    val openScreenAction = SingleLiveEvent<Unit>()
    private val buttons = listOf("first", "second", "second feature start")

    init {
        viewState.value = FeatureFirstViewState(buttons)
    }

    fun onButtonClick(value: String) {
        Timber.d("Receive button click: $value")
        googleAnalytics.track(value)
        if (value == buttons[2]) openScreenAction.call()
    }
}