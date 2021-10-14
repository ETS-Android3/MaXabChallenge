package com.example.feature_currencyconverter.data.remote.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/example/feature_currencyconverter/data/remote/service/CurrenciesAPIService;", "", "getCurrencies", "Lcom/example/feature_currencyconverter/data/remote/model/CurrenciesResponse;", "format", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_currencyconverter_debug"})
public abstract interface CurrenciesAPIService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/latest")
    public abstract java.lang.Object getCurrencies(@retrofit2.http.Query(value = "format")
    int format, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.feature_currencyconverter.data.remote.model.CurrenciesResponse> continuation);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}