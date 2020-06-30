package com.example.diexample.network

import com.example.diexample.network.interceptor.RequestInterceptor
import javax.inject.Inject

interface CoreApi {
    fun callRequest()
}

class CoreApiImpl @Inject constructor(
    interceptor: RequestInterceptor
): CoreApi {
    override fun callRequest() {
        //...
    }
}