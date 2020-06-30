package com.example.diexample.feature_2.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/diexample/feature_2/di/FeatureSecondComponent;", "", "inject", "", "fragment", "Lcom/example/diexample/feature_2/ui/FragmentSecondFeature;", "Factory", "feature_2_debug"})
@dagger.Component(dependencies = {com.example.diexample.feature_2.di.FeatureSecondDependencies.class}, modules = {com.example.diexample.feature_2.di.FeatureSecondModule.class})
@com.example.diexample.di.PerFragment()
public abstract interface FeatureSecondComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.diexample.feature_2.ui.FragmentSecondFeature fragment);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/diexample/feature_2/di/FeatureSecondComponent$Factory;", "", "create", "Lcom/example/diexample/feature_2/di/FeatureSecondComponent;", "dependencies", "Lcom/example/diexample/feature_2/di/FeatureSecondDependencies;", "featureSecondModule", "Lcom/example/diexample/feature_2/di/FeatureSecondModule;", "feature_2_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.diexample.feature_2.di.FeatureSecondComponent create(@org.jetbrains.annotations.NotNull()
        com.example.diexample.feature_2.di.FeatureSecondDependencies dependencies, @org.jetbrains.annotations.NotNull()
        com.example.diexample.feature_2.di.FeatureSecondModule featureSecondModule);
    }
}