package com.example.diexample.feature_1.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.diexample.analytics.GoogleAnalytics
import javax.inject.Inject

@Suppress("UNCHECKED_CAST")
class FeatureFirstViewModelFactory @Inject constructor(
    private val googleAnalytics: GoogleAnalytics
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FeatureFirstViewModel(googleAnalytics) as T
    }
}