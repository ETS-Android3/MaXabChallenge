package com.example.feature_currencyconverter.presentation.convert.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/example/feature_currencyconverter/presentation/convert/di/ConvertCurrencyFragmentBuilderModule;", "", "()V", "provideConvertCurrencyFragment", "Lcom/example/feature_currencyconverter/presentation/convert/ui/fragment/ConvertCurrencyFragment;", "feature_currencyconverter_debug"})
@dagger.Module()
public abstract class ConvertCurrencyFragmentBuilderModule {
    
    public ConvertCurrencyFragmentBuilderModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.example.feature_currencyconverter.presentation.convert.di.ConvertCurrencyModule.class})
    public abstract com.example.feature_currencyconverter.presentation.convert.ui.fragment.ConvertCurrencyFragment provideConvertCurrencyFragment();
}