package com.example.diexample.feature_1.di

import com.example.diexample.di.PerActivity
import com.example.diexample.feature_1.ui.ActivityFirstFeature
import dagger.Component

@PerActivity
@Component(
    modules = [FeatureFirstModule::class],
    dependencies = [FeatureFirstDependencies::class]
)
interface FeatureFirstComponent {

    fun inject(activity: ActivityFirstFeature)

    @Component.Factory
    interface Factory {
        fun create(
            dependencies: FeatureFirstDependencies,
            featureFirstModule: FeatureFirstModule // why we need it here?
        ): FeatureFirstComponent
    }
}