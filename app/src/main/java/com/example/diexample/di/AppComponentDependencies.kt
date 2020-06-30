package com.example.diexample.di

import android.app.Application

interface AppComponentDependencies: ComponentDependencies {
    fun app(): Application
}