package com.example.diexample.delegate

import android.app.Application
import androidx.annotation.MainThread

interface AppStartTask {
    @MainThread
    fun invoke(app: Application)
}