package com.example.diexample.feature_2.di

import com.example.diexample.feature_2.FeatureSecondRepo
import com.example.diexample.feature_2.FeatureSecondRepoImpl
import dagger.Binds
import dagger.Module

// This module provides only internal feature things, that are not accessible by other features

@Module(includes = [FeatureSecondModule.Binding::class])
class FeatureSecondModule {

    @Module
    abstract class Binding {

        @Binds
        @FeatureSecondScope
        internal abstract fun bindFeatureSecondRepo(starter: FeatureSecondRepoImpl): FeatureSecondRepo
    }
}