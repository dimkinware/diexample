package com.example.diexample.feature_2.di

import com.example.diexample.feature_2.FeatureSecondInteractor
import com.example.diexample.feature_2.FeatureSecondInteractorImpl
import com.example.diexample.feature_2.FeatureSecondStarter
import com.example.diexample.feature_2.FeatureSecondStarterImpl
import dagger.Binds
import dagger.Module


// This module provides _API_ of this feature for using in other features too
// Pay attention that this module is used in AppComponent _only_

@Module(
    includes = [FeatureSecondModule::class,
        FeatureSecondModuleApi.Binding::class]
)
class FeatureSecondModuleApi {

    @Module
    abstract class Binding {

        @Binds
        @FeatureSecondScope
        internal abstract fun bindFeatureSecondStarter(starter: FeatureSecondStarterImpl): FeatureSecondStarter

        @Binds
        @FeatureSecondScope
        internal abstract fun bindFeatureSecondInteractor(starter: FeatureSecondInteractorImpl): FeatureSecondInteractor
    }
}