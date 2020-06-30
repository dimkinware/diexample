package com.example.diexample.feature_1.di

import com.example.diexample.analytics.GoogleAnalytics
import com.example.diexample.di.ComponentDependencies

interface FeatureFirstDependencies : ComponentDependencies {
    fun getGoogleAnalytics(): GoogleAnalytics
}