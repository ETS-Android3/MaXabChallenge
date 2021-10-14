package com.example.feature_currencyconverter.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/example/feature_currencyconverter/data/local/CurrenciesDao;", "", "getAll", "Lcom/example/feature_currencyconverter/data/local/model/CurrencyEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCountries", "", "currency", "(Lcom/example/feature_currencyconverter/data/local/model/CurrencyEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_currencyconverter_debug"})
public abstract interface CurrenciesDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM currencies")
    public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.feature_currencyconverter.data.local.model.CurrencyEntity> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertCountries(@org.jetbrains.annotations.NotNull()
    com.example.feature_currencyconverter.data.local.model.CurrencyEntity currency, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}