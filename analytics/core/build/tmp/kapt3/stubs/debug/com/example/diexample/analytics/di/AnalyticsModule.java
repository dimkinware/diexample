package com.example.diexample.analytics.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/diexample/analytics/di/AnalyticsModule;", "", "()V", "provideImportantId", "", "importantAnalyticsUtility", "Lcom/example/diexample/analytics/ImportantAnalyticsUtility;", "Binding", "core_debug"})
@dagger.Module(includes = {com.example.diexample.analytics.di.AnalyticsModule.Binding.class, com.example.diexample.analytics.di.AdjustModule.class, com.example.diexample.analytics.di.GoogleModule.class})
public final class AnalyticsModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.example.diexample.analytics.ImportantId()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final java.lang.String provideImportantId(@org.jetbrains.annotations.NotNull()
    com.example.diexample.analytics.ImportantAnalyticsUtility importantAnalyticsUtility) {
        return null;
    }
    
    public AnalyticsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/example/diexample/analytics/di/AnalyticsModule$Binding;", "", "bindImportantAnalyticsUtilityClass", "Lcom/example/diexample/analytics/ImportantAnalyticsUtility;", "importantAnalyticsUtility", "Lcom/example/diexample/analytics/ImportantAnalyticsUtilityImpl;", "core_debug"})
    @dagger.Module()
    public static abstract interface Binding {
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Binds()
        public abstract com.example.diexample.analytics.ImportantAnalyticsUtility bindImportantAnalyticsUtilityClass(@org.jetbrains.annotations.NotNull()
        com.example.diexample.analytics.ImportantAnalyticsUtilityImpl importantAnalyticsUtility);
    }
}