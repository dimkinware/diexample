package com.example.diexample.delegate.tasks

import android.app.Application
import com.example.diexample.delegate.AppStartTask
import javax.inject.Inject

class SecondImportantLibraryStartTask @Inject constructor(): AppStartTask {

    override fun invoke(app: Application) {
        //second important library start task
    }
}