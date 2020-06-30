package com.example.diexample

import android.app.Application
import com.example.diexample.delegate.AppDelegate
import com.example.diexample.di.AppComponent
import com.example.diexample.di.AppModule
import com.example.diexample.di.ComponentDependenciesProvider
import com.example.diexample.di.DaggerAppComponent
import com.example.diexample.di.HasComponentDependencies
import javax.inject.Inject

class App : Application(), HasComponentDependencies {

    @Inject
    override lateinit var dependencies: ComponentDependenciesProvider

    @Inject
    lateinit var appDelegate: AppDelegate

    private var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()

        selfInject()
        initTasks()
    }

    private fun selfInject() {
        obtainComponent().inject(this)
    }

    private fun obtainComponent(): AppComponent {
        if (appComponent == null) {
            appComponent = createAppComponent()
        }

        return appComponent!!
    }

    private fun createAppComponent(): AppComponent {
        return DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

    private fun initTasks() {
        appDelegate.initialize()
    }
}