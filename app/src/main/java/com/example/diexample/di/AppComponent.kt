package com.example.diexample.di

import com.example.diexample.App
import com.example.diexample.analytics.di.AnalyticsModule
import com.example.diexample.feature_1.di.FeatureFirstDependencies
import com.example.diexample.feature_2.di.FeatureSecondDependencies
import com.example.diexample.network.di.NetworkCoreModule
import dagger.Component
import javax.inject.Singleton

/**
 * Default App Component
 */
@Singleton
@Component(
    modules = [
        AppModule::class,
        NetworkCoreModule::class,
        AnalyticsModule::class,
        ComponentDependenciesModule::class
    ]
)
interface AppComponent
    : AppComponentDependencies,
      FeatureFirstDependencies,
      FeatureSecondDependencies {

    fun inject(app: App)
}