package com.example.feature_currencyconverter.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/feature_currencyconverter/data/CurrenciesRepositoryImpl;", "Lcom/example/feature_currencyconverter/domain/repository/CurrenciesRepository;", "countriesAPIService", "Lcom/example/feature_currencyconverter/data/remote/service/CountriesAPIService;", "countriesDao", "Lcom/example/feature_currencyconverter/data/local/CountriesDao;", "(Lcom/example/feature_currencyconverter/data/remote/service/CountriesAPIService;Lcom/example/feature_currencyconverter/data/local/CountriesDao;)V", "getCurrencies", "Lcom/example/feature_currencyconverter/domain/model/Country;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_currencyconverter_debug"})
public final class CurrenciesRepositoryImpl implements com.example.feature_currencyconverter.domain.repository.CurrenciesRepository {
    private final com.example.feature_currencyconverter.data.remote.service.CountriesAPIService countriesAPIService = null;
    private final com.example.feature_currencyconverter.data.local.CountriesDao countriesDao = null;
    
    @javax.inject.Inject()
    public CurrenciesRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.feature_currencyconverter.data.remote.service.CountriesAPIService countriesAPIService, @org.jetbrains.annotations.NotNull()
    com.example.feature_currencyconverter.data.local.CountriesDao countriesDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCurrencies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.feature_currencyconverter.domain.model.Country> continuation) {
        return null;
    }
}