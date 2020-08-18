package com.example.diexample.feature_2.di

import com.example.diexample.di.PerFragment
import com.example.diexample.feature_2.ui.FragmentSecondFeature
import dagger.Component

@FeatureSecondScope
@PerFragment
@Component(
    modules = [FeatureSecondModule::class],
    dependencies = [FeatureSecondDependencies::class]
)
interface FeatureSecondComponent {

    fun inject(fragment: FragmentSecondFeature)

    @Component.Factory
    interface Factory {
        fun create(
            dependencies: FeatureSecondDependencies,
            featureSecondModule: FeatureSecondModule
        ): FeatureSecondComponent
    }
}