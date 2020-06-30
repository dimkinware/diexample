package com.example.diexample.analytics.di

import com.example.diexample.analytics.ImportantAnalyticsUtility
import com.example.diexample.analytics.ImportantAnalyticsUtilityImpl
import com.example.diexample.analytics.ImportantId
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    includes = [
        AnalyticsModule.Binding::class,
        AdjustModule::class,
        GoogleModule::class
    ]
)
class AnalyticsModule {

    @Singleton
    @Provides
    @ImportantId
    fun provideImportantId(importantAnalyticsUtility: ImportantAnalyticsUtility): String {
        return importantAnalyticsUtility.provideImportantId()
    }

    @Module
    interface Binding {
        @Binds
        @Singleton
        fun bindImportantAnalyticsUtilityClass(importantAnalyticsUtility: ImportantAnalyticsUtilityImpl): ImportantAnalyticsUtility
    }
}