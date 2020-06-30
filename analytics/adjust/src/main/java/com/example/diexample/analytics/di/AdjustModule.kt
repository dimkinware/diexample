package com.example.diexample.analytics.di

import com.example.diexample.analytics.Adjust
import com.example.diexample.analytics.AdjustImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface AdjustModule {

    @Binds
    @Singleton
    fun bindAdjust(adjust: AdjustImpl): Adjust
}