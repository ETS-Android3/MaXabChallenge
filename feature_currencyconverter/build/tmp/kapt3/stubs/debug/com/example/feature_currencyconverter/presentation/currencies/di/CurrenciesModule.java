package com.example.feature_currencyconverter.presentation.currencies.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001\u00a2\u0006\u0002\b\u0011J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0001\u00a2\u0006\u0002\b\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/example/feature_currencyconverter/presentation/currencies/di/CurrenciesModule;", "", "()V", "provideAlbumDao", "Lcom/example/feature_currencyconverter/data/local/CurrenciesDao;", "currencyConverterDatabase", "Lcom/example/feature_currencyconverter/data/local/CurrencyConverterDatabase;", "provideAlbumDao$feature_currencyconverter_debug", "provideAlbumRepository", "Lcom/example/feature_currencyconverter/domain/repository/CurrenciesRepository;", "currenciesAPIService", "Lcom/example/feature_currencyconverter/data/remote/service/CurrenciesAPIService;", "currenciesDao", "provideAlbumRepository$feature_currencyconverter_debug", "provideCountriesAPIService", "retrofit", "Lretrofit2/Retrofit$Builder;", "provideCountriesAPIService$feature_currencyconverter_debug", "provideCurrencyConverterDatabase", "context", "Landroid/content/Context;", "provideCurrencyConverterDatabase$feature_currencyconverter_debug", "feature_currencyconverter_debug"})
@dagger.Module()
public final class CurrenciesModule {
    
    public CurrenciesModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.feature_currencyconverter.data.remote.service.CurrenciesAPIService provideCountriesAPIService$feature_currencyconverter_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.feature_currencyconverter.data.local.CurrencyConverterDatabase provideCurrencyConverterDatabase$feature_currencyconverter_debug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.feature_currencyconverter.data.local.CurrenciesDao provideAlbumDao$feature_currencyconverter_debug(@org.jetbrains.annotations.NotNull()
    com.example.feature_currencyconverter.data.local.CurrencyConverterDatabase currencyConverterDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.feature_currencyconverter.domain.repository.CurrenciesRepository provideAlbumRepository$feature_currencyconverter_debug(@org.jetbrains.annotations.NotNull()
    com.example.feature_currencyconverter.data.remote.service.CurrenciesAPIService currenciesAPIService, @org.jetbrains.annotations.NotNull()
    com.example.feature_currencyconverter.data.local.CurrenciesDao currenciesDao) {
        return null;
    }
}