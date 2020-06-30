package com.example.diexample.di

import android.app.Application
import com.example.diexample.delegate.AppDelegate
import com.example.diexample.delegate.AppDelegateImpl
import com.example.diexample.delegate.AppStartTask
import com.example.diexample.delegate.tasks.FirstImportantLibraryStartTask
import com.example.diexample.delegate.tasks.SecondImportantLibraryStartTask
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet
import javax.inject.Singleton

/**
 * Default App Module
 */
@Module(includes = [AppModule.Binding::class])
class AppModule(private val app: Application) {

    @Singleton
    @Provides
    fun provideApp(): Application {
        return app
    }

    @Singleton
    @Provides
    fun provideAppDelegate(tasks: Set<@JvmSuppressWildcards AppStartTask>): AppDelegate {
        return AppDelegateImpl(app, tasks)
    }

    @Module
    interface Binding {

        @Singleton
        @Binds
        fun bindAppComponent(component: AppComponent): ComponentDependencies

        @Singleton
        @IntoSet
        @Binds
        fun bindInitFirstImportantLibraryStartTask(firstInitLibraryTask: FirstImportantLibraryStartTask): AppStartTask

        @Singleton
        @IntoSet
        @Binds
        fun bindSecondImportantLibraryStartTask(secondImportantLibraryStartTask: SecondImportantLibraryStartTask): AppStartTask
    }
}