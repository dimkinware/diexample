package com.example.diexample.analytics

import android.app.Application
import android.widget.Toast
import javax.inject.Inject

interface GoogleAnalytics {
    fun track(value: String)
}

class GoogleAnalyticsImpl @Inject constructor(private val app: Application) : GoogleAnalytics {
    override fun track(value: String) {
        Toast.makeText(app, "google track: $value", Toast.LENGTH_SHORT).show()
    }
}