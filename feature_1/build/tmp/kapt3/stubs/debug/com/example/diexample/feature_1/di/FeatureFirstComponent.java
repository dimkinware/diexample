package com.example.diexample.feature_1.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/diexample/feature_1/di/FeatureFirstComponent;", "", "inject", "", "activity", "Lcom/example/diexample/feature_1/ui/ActivityFirstFeature;", "Factory", "feature_1_debug"})
@dagger.Component(modules = {com.example.diexample.feature_1.di.FeatureFirstModule.class}, dependencies = {com.example.diexample.feature_1.di.FeatureFirstDependencies.class})
@com.example.diexample.di.PerActivity()
public abstract interface FeatureFirstComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.diexample.feature_1.ui.ActivityFirstFeature activity);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/diexample/feature_1/di/FeatureFirstComponent$Factory;", "", "create", "Lcom/example/diexample/feature_1/di/FeatureFirstComponent;", "dependencies", "Lcom/example/diexample/feature_1/di/FeatureFirstDependencies;", "featureFirstModule", "Lcom/example/diexample/feature_1/di/FeatureFirstModule;", "feature_1_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.diexample.feature_1.di.FeatureFirstComponent create(@org.jetbrains.annotations.NotNull()
        com.example.diexample.feature_1.di.FeatureFirstDependencies dependencies, @org.jetbrains.annotations.NotNull()
        com.example.diexample.feature_1.di.FeatureFirstModule featureFirstModule);
    }
}