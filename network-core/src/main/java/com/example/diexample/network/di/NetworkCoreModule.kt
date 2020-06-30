package com.example.diexample.network.di

import com.example.diexample.network.CoreApiImpl
import com.example.diexample.network.CoreApi
import com.example.diexample.network.interceptor.FirstInterceptor
import com.example.diexample.network.interceptor.RequestInterceptor
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface NetworkCoreModule {

    @Binds
    @Singleton
    fun provideCoreApi(api: CoreApiImpl): CoreApi

    //todo into set
    @Binds
    @Singleton
    fun bindRequestInterceptor(interceptor: FirstInterceptor): RequestInterceptor
}