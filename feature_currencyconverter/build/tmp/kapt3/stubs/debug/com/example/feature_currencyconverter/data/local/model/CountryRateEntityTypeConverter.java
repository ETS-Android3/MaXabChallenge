package com.example.feature_currencyconverter.data.local.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\t0\bH\u0007J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/feature_currencyconverter/data/local/model/CountryRateEntityTypeConverter;", "", "()V", "ENTRY_SEPARATOR", "", "KEY_VALUE_SEPARATOR", "mapToString", "map", "", "", "stringToMap", "string", "feature_currencyconverter_debug"})
public final class CountryRateEntityTypeConverter {
    private final java.lang.String KEY_VALUE_SEPARATOR = "=";
    private final java.lang.String ENTRY_SEPARATOR = "||";
    
    public CountryRateEntityTypeConverter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String mapToString(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Double> map) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.Map<java.lang.String, java.lang.Double> stringToMap(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return null;
    }
}