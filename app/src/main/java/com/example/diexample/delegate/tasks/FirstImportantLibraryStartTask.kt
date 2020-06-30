package com.example.diexample.delegate.tasks

import android.app.Application
import com.example.diexample.delegate.AppStartTask
import timber.log.Timber
import javax.inject.Inject

class FirstImportantLibraryStartTask @Inject constructor(): AppStartTask {

    override fun invoke(app: Application) {
        Timber.plant(Timber.DebugTree())
    }
}