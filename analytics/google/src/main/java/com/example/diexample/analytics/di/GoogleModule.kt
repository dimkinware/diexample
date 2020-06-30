package com.example.diexample.analytics.di

import com.example.diexample.analytics.GoogleAnalytics
import com.example.diexample.analytics.GoogleAnalyticsImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface GoogleModule {

    @Binds
    @Singleton
    fun bindGoogleAnalytics(googleAnalytics: GoogleAnalyticsImpl): GoogleAnalytics
}