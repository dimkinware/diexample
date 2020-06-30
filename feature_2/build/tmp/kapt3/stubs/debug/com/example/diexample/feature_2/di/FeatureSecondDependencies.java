package com.example.diexample.feature_2.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/diexample/feature_2/di/FeatureSecondDependencies;", "Lcom/example/diexample/di/ComponentDependencies;", "getAdjustAnalytics", "Lcom/example/diexample/analytics/Adjust;", "getCoreApi", "Lcom/example/diexample/network/CoreApi;", "feature_2_debug"})
public abstract interface FeatureSecondDependencies extends com.example.diexample.di.ComponentDependencies {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.diexample.analytics.Adjust getAdjustAnalytics();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.diexample.network.CoreApi getCoreApi();
}