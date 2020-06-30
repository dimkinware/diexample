package com.example.diexample.feature_1.di

import dagger.Module

import androidx.lifecycle.ViewModelProvider
import com.example.diexample.di.PerActivity
import com.example.diexample.feature_1.viewmodel.FeatureFirstViewModelFactory
import dagger.Binds

@Module(includes = [FeatureFirstModule.Binding::class])
class FeatureFirstModule {

    @Module
    interface Binding {

        @Binds
        @PerActivity
        fun provideViewModelFactory(viewModelFactory: FeatureFirstViewModelFactory): ViewModelProvider.Factory
    }
}