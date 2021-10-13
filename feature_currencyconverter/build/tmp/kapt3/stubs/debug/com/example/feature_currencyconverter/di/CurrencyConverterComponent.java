package com.example.feature_currencyconverter.di;

import java.lang.System;

@com.example.feature_currencyconverter.di.scopes.CurrencyConverterScope()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/feature_currencyconverter/di/CurrencyConverterComponent;", "", "inject", "", "fragment", "Lcom/example/core/base/presentation/activity/BaseActivity;", "Builder", "feature_currencyconverter_debug"})
@dagger.Component(dependencies = {com.example.core.di.component.BaseComponent.class}, modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.example.feature_currencyconverter.presentation.currencies.di.CurrenciesFragmentBuilderModule.class, com.example.feature_currencyconverter.presentation.convert.di.ConvertCurrencyFragmentBuilderModule.class, com.example.core.di.module.BaseModule.class})
public abstract interface CurrencyConverterComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.core.base.presentation.activity.BaseActivity fragment);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/example/feature_currencyconverter/di/CurrencyConverterComponent$Builder;", "", "application", "Landroid/app/Application;", "baseComponent", "component", "Lcom/example/core/di/component/BaseComponent;", "build", "Lcom/example/feature_currencyconverter/di/CurrencyConverterComponent;", "feature_currencyconverter_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.example.feature_currencyconverter.di.CurrencyConverterComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.feature_currencyconverter.di.CurrencyConverterComponent.Builder baseComponent(@org.jetbrains.annotations.NotNull()
        com.example.core.di.component.BaseComponent component);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.feature_currencyconverter.di.CurrencyConverterComponent build();
    }
}