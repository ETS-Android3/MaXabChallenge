package com.example.feature_currencyconverter.presentation.convert.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/feature_currencyconverter/presentation/convert/viewmodel/ConvertCurrencyViewModel;", "Landroidx/lifecycle/ViewModel;", "convertCurrencyUseCase", "Lcom/example/feature_currencyconverter/domain/usecase/ConvertCurrencyUseCase;", "(Lcom/example/feature_currencyconverter/domain/usecase/ConvertCurrencyUseCase;)V", "convert", "", "amount", "", "selectedCurrencyRate", "feature_currencyconverter_debug"})
public final class ConvertCurrencyViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.feature_currencyconverter.domain.usecase.ConvertCurrencyUseCase convertCurrencyUseCase = null;
    
    @javax.inject.Inject()
    public ConvertCurrencyViewModel(@org.jetbrains.annotations.NotNull()
    com.example.feature_currencyconverter.domain.usecase.ConvertCurrencyUseCase convertCurrencyUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String convert(double amount, double selectedCurrencyRate) {
        return null;
    }
}