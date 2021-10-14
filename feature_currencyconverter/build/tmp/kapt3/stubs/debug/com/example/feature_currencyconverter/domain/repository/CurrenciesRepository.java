package com.example.feature_currencyconverter.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/example/feature_currencyconverter/domain/repository/CurrenciesRepository;", "", "getBaseCurrency", "Lcom/example/feature_currencyconverter/domain/model/CountryRate;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrencies", "Lcom/example/feature_currencyconverter/domain/model/Country;", "feature_currencyconverter_debug"})
public abstract interface CurrenciesRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCurrencies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.feature_currencyconverter.domain.model.Country> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBaseCurrency(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.feature_currencyconverter.domain.model.CountryRate> continuation);
}