package com.example.diexample.feature_1.di

import com.example.diexample.analytics.GoogleAnalytics
import com.example.diexample.di.ComponentDependencies
import com.example.diexample.feature_2.FeatureSecondInteractor
import com.example.diexample.feature_2.FeatureSecondStarter

interface FeatureFirstDependencies : ComponentDependencies {
    fun getGoogleAnalytics(): GoogleAnalytics
    // from feature second:
    fun getFeatureSecondStarter(): FeatureSecondStarter
    fun getFeatureSecondInteractor(): FeatureSecondInteractor
}