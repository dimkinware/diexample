package com.example.diexample.feature_1.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.diexample.analytics.GoogleAnalytics
import com.example.diexample.livedata.SingleLiveEvent
import timber.log.Timber

class FeatureFirstViewModel(
    private val googleAnalytics: GoogleAnalytics
) : ViewModel() {

    val viewState = MutableLiveData<FeatureFirstViewState>()
    val openScreenAction = SingleLiveEvent<Unit>()
    private val buttons = listOf("first", "second", "third")

    init {
        viewState.value = FeatureFirstViewState(buttons)
    }

    fun onButtonClick(value: String) {
        Timber.d("Receive button click: $value")
        googleAnalytics.track(value)
        if (value == buttons[2]) openScreenAction.call()
    }
}