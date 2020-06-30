package com.example.diexample.analytics.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/example/diexample/analytics/di/GoogleModule;", "", "bindGoogleAnalytics", "Lcom/example/diexample/analytics/GoogleAnalytics;", "googleAnalytics", "Lcom/example/diexample/analytics/GoogleAnalyticsImpl;", "google_debug"})
@dagger.Module()
public abstract interface GoogleModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.example.diexample.analytics.GoogleAnalytics bindGoogleAnalytics(@org.jetbrains.annotations.NotNull()
    com.example.diexample.analytics.GoogleAnalyticsImpl googleAnalytics);
}