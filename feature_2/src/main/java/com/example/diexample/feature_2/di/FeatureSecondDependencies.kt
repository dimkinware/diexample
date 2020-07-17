package com.example.diexample.feature_2.di

import com.example.diexample.analytics.Adjust
import com.example.diexample.di.ComponentDependencies
import com.example.diexample.feature_2.FeatureSecondInteractor
import com.example.diexample.network.CoreApi

interface FeatureSecondDependencies: ComponentDependencies {
    fun getAdjustAnalytics(): Adjust
    fun getCoreApi(): CoreApi
    fun getFeatureSecondInteractor(): FeatureSecondInteractor
}