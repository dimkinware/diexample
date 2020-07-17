package com.example.diexample.feature_2.di

import com.example.diexample.feature_2.FeatureSecondInteractor
import com.example.diexample.feature_2.FeatureSecondInteractorImpl
import com.example.diexample.feature_2.FeatureSecondStarter
import com.example.diexample.feature_2.FeatureSecondStarterImpl
import dagger.Module
import dagger.Provides


// This module provides _API_ of this feature for using in other features
// Pay attention that this module is used in AppComponent _only_

@Module
class FeatureSecondModuleApi {

    @Provides
    @FeatureSecondScope
    fun provideFeatureSecondStarter() : FeatureSecondStarter {
        return FeatureSecondStarterImpl()
    }

    @Provides
    @FeatureSecondScope
    fun provideFeatureSecondInteractor() : FeatureSecondInteractor {
        return FeatureSecondInteractorImpl()
    }
}