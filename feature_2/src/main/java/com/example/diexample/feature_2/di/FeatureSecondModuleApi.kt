package com.example.diexample.feature_2.di

import com.example.diexample.feature_2.FeatureSecondInteractor
import com.example.diexample.feature_2.FeatureSecondInteractorImpl
import com.example.diexample.feature_2.FeatureSecondStarter
import com.example.diexample.feature_2.FeatureSecondStarterImpl
import dagger.Module
import dagger.Provides


// This module provides API of this feature for using in other features
// Pay attention that this module is used in AppComponent and in FeatureSecondComponent!
// I'm not sure about scope here!

@Module
class FeatureSecondModuleApi {

    @Provides
    fun provideFeatureSecondStarter() : FeatureSecondStarter {
        return FeatureSecondStarterImpl()
    }

    @Provides
    fun provideFeatureSecondInteractor() : FeatureSecondInteractor {
        return FeatureSecondInteractorImpl()
    }
}