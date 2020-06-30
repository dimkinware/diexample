package com.example.diexample.delegate

import android.app.Application

interface AppDelegate {
    fun initialize()
}

class AppDelegateImpl(
    private val app: Application,
    private val appStartTasks: Set<AppStartTask>
): AppDelegate {

    override fun initialize() {
        appStartTasks.forEach { it.invoke(app) }
    }
}