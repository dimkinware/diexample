package com.example.diexample.analytics

import javax.inject.Inject

interface Adjust {
    fun track(value: String)
}

class AdjustImpl @Inject constructor(): Adjust {
    override fun track(value: String) {}
}