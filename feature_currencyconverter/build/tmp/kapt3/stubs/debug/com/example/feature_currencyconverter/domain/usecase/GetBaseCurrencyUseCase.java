package com.example.feature_currencyconverter.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/example/feature_currencyconverter/domain/usecase/GetBaseCurrencyUseCase;", "", "currenciesRepository", "Lcom/example/feature_currencyconverter/domain/repository/CurrenciesRepository;", "(Lcom/example/feature_currencyconverter/domain/repository/CurrenciesRepository;)V", "execute", "Lcom/example/feature_currencyconverter/domain/usecase/GetBaseCurrencyUseCase$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Result", "feature_currencyconverter_debug"})
public final class GetBaseCurrencyUseCase {
    private final com.example.feature_currencyconverter.domain.repository.CurrenciesRepository currenciesRepository = null;
    
    @javax.inject.Inject()
    public GetBaseCurrencyUseCase(@org.jetbrains.annotations.NotNull()
    com.example.feature_currencyconverter.domain.repository.CurrenciesRepository currenciesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.feature_currencyconverter.domain.usecase.GetBaseCurrencyUseCase.Result> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/feature_currencyconverter/domain/usecase/GetBaseCurrencyUseCase$Result;", "", "Error", "Success", "Lcom/example/feature_currencyconverter/domain/usecase/GetBaseCurrencyUseCase$Result$Success;", "Lcom/example/feature_currencyconverter/domain/usecase/GetBaseCurrencyUseCase$Result$Error;", "feature_currencyconverter_debug"})
    public static abstract interface Result {
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/feature_currencyconverter/domain/usecase/GetBaseCurrencyUseCase$Result$Success;", "Lcom/example/feature_currencyconverter/domain/usecase/GetBaseCurrencyUseCase$Result;", "data", "Lcom/example/feature_currencyconverter/domain/model/CurrencyRate;", "(Lcom/example/feature_currencyconverter/domain/model/CurrencyRate;)V", "getData", "()Lcom/example/feature_currencyconverter/domain/model/CurrencyRate;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature_currencyconverter_debug"})
        public static final class Success implements com.example.feature_currencyconverter.domain.usecase.GetBaseCurrencyUseCase.Result {
            @org.jetbrains.annotations.Nullable()
            private final com.example.feature_currencyconverter.domain.model.CurrencyRate data = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.feature_currencyconverter.domain.usecase.GetBaseCurrencyUseCase.Result.Success copy(@org.jetbrains.annotations.Nullable()
            com.example.feature_currencyconverter.domain.model.CurrencyRate data) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Success(@org.jetbrains.annotations.Nullable()
            com.example.feature_currencyconverter.domain.model.CurrencyRate data) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.example.feature_currencyconverter.domain.model.CurrencyRate component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.example.feature_currencyconverter.domain.model.CurrencyRate getData() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/feature_currencyconverter/domain/usecase/GetBaseCurrencyUseCase$Result$Error;", "Lcom/example/feature_currencyconverter/domain/usecase/GetBaseCurrencyUseCase$Result;", "e", "", "(Ljava/lang/Throwable;)V", "getE", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature_currencyconverter_debug"})
        public static final class Error implements com.example.feature_currencyconverter.domain.usecase.GetBaseCurrencyUseCase.Result {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable e = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.feature_currencyconverter.domain.usecase.GetBaseCurrencyUseCase.Result.Error copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable e) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable e) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getE() {
                return null;
            }
        }
    }
}