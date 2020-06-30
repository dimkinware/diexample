package com.example.diexample.feature_1.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/diexample/feature_1/di/FeatureFirstModule;", "", "()V", "Binding", "feature_1_debug"})
@dagger.Module(includes = {com.example.diexample.feature_1.di.FeatureFirstModule.Binding.class})
public final class FeatureFirstModule {
    
    public FeatureFirstModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/example/diexample/feature_1/di/FeatureFirstModule$Binding;", "", "provideViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "Lcom/example/diexample/feature_1/viewmodel/FeatureFirstViewModelFactory;", "feature_1_debug"})
    @dagger.Module()
    public static abstract interface Binding {
        
        @org.jetbrains.annotations.NotNull()
        @com.example.diexample.di.PerActivity()
        @dagger.Binds()
        public abstract androidx.lifecycle.ViewModelProvider.Factory provideViewModelFactory(@org.jetbrains.annotations.NotNull()
        com.example.diexample.feature_1.viewmodel.FeatureFirstViewModelFactory viewModelFactory);
    }
}