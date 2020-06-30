package com.example.diexample.di

import com.example.diexample.feature_1.di.FeatureFirstDependencies
import com.example.diexample.feature_2.di.FeatureSecondDependencies
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ComponentDependenciesModule {

    @Binds
    @IntoMap
    @ComponentDependenciesKey(FeatureFirstDependencies::class)
    fun provideFeatureFirstDependencies(component: AppComponent): ComponentDependencies

    @Binds
    @IntoMap
    @ComponentDependenciesKey(FeatureSecondDependencies::class)
    fun provideFeatureSecondDependencies(component: AppComponent): ComponentDependencies

}