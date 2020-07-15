package com.example.diexample.feature_1.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.diexample.analytics.GoogleAnalytics
import com.example.diexample.feature_2.FeatureSecondInteractor
import javax.inject.Inject

@Suppress("UNCHECKED_CAST")
class FeatureFirstViewModelFactory @Inject constructor(
    private val googleAnalytics: GoogleAnalytics,
    private val featureSecondInteractor: FeatureSecondInteractor
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FeatureFirstViewModel(googleAnalytics, featureSecondInteractor) as T
    }
}