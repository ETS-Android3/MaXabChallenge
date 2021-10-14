package com.example.feature_currencyconverter.presentation.currencies.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0014\u0015B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u0011\u001a\u00020\fH\u0014J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel;", "Lcom/example/core/base/presentation/viewmodel/BaseViewModel;", "Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel$ViewState;", "Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel$Action;", "getCurrenciesUseCase", "Lcom/example/feature_currencyconverter/domain/usecase/GetCurrenciesUseCase;", "(Lcom/example/feature_currencyconverter/domain/usecase/GetCurrenciesUseCase;)V", "buildCountryRateConverter", "Lcom/example/feature_currencyconverter/presentation/convert/model/CountryRateConverter;", "selectedCountry", "Lcom/example/feature_currencyconverter/domain/model/CountryRate;", "getCurrenciesList", "", "handleResultState", "result", "Lcom/example/feature_currencyconverter/domain/usecase/GetCurrenciesUseCase$Result;", "navigateToConvertCurrency", "onLoadData", "onReduceState", "viewAction", "Action", "ViewState", "feature_currencyconverter_debug"})
public final class CurrenciesViewModel extends com.example.core.base.presentation.viewmodel.BaseViewModel<com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel.ViewState, com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel.Action> {
    private final com.example.feature_currencyconverter.domain.usecase.GetCurrenciesUseCase getCurrenciesUseCase = null;
    
    @javax.inject.Inject()
    public CurrenciesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.feature_currencyconverter.domain.usecase.GetCurrenciesUseCase getCurrenciesUseCase) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onLoadData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel.ViewState onReduceState(@org.jetbrains.annotations.NotNull()
    com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel.Action viewAction) {
        return null;
    }
    
    private final void getCurrenciesList() {
    }
    
    private final com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel.Action handleResultState(com.example.feature_currencyconverter.domain.usecase.GetCurrenciesUseCase.Result result) {
        return null;
    }
    
    public final void navigateToConvertCurrency(@org.jetbrains.annotations.NotNull()
    com.example.feature_currencyconverter.domain.model.CountryRate selectedCountry) {
    }
    
    private final com.example.feature_currencyconverter.presentation.convert.model.CountryRateConverter buildCountryRateConverter(com.example.feature_currencyconverter.domain.model.CountryRate selectedCountry) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel$ViewState;", "Lcom/example/core/base/presentation/viewmodel/BaseViewState;", "isLoading", "", "isError", "country", "Lcom/example/feature_currencyconverter/domain/model/Country;", "(ZZLcom/example/feature_currencyconverter/domain/model/Country;)V", "getCountry", "()Lcom/example/feature_currencyconverter/domain/model/Country;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature_currencyconverter_debug"})
    public static final class ViewState implements com.example.core.base.presentation.viewmodel.BaseViewState {
        private final boolean isLoading = false;
        private final boolean isError = false;
        @org.jetbrains.annotations.Nullable()
        private final com.example.feature_currencyconverter.domain.model.Country country = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel.ViewState copy(boolean isLoading, boolean isError, @org.jetbrains.annotations.Nullable()
        com.example.feature_currencyconverter.domain.model.Country country) {
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
        
        public ViewState() {
            super();
        }
        
        public ViewState(boolean isLoading, boolean isError, @org.jetbrains.annotations.Nullable()
        com.example.feature_currencyconverter.domain.model.Country country) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isLoading() {
            return false;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isError() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.feature_currencyconverter.domain.model.Country component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.feature_currencyconverter.domain.model.Country getCountry() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel$Action;", "Lcom/example/core/base/presentation/viewmodel/BaseAction;", "Loading", "LoadingFailure", "LoadingSuccess", "Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel$Action$LoadingSuccess;", "Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel$Action$LoadingFailure;", "Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel$Action$Loading;", "feature_currencyconverter_debug"})
    public static abstract interface Action extends com.example.core.base.presentation.viewmodel.BaseAction {
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel$Action$LoadingSuccess;", "Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel$Action;", "country", "Lcom/example/feature_currencyconverter/domain/model/Country;", "(Lcom/example/feature_currencyconverter/domain/model/Country;)V", "getCountry", "()Lcom/example/feature_currencyconverter/domain/model/Country;", "feature_currencyconverter_debug"})
        public static final class LoadingSuccess implements com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel.Action {
            @org.jetbrains.annotations.NotNull()
            private final com.example.feature_currencyconverter.domain.model.Country country = null;
            
            public LoadingSuccess(@org.jetbrains.annotations.NotNull()
            com.example.feature_currencyconverter.domain.model.Country country) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.feature_currencyconverter.domain.model.Country getCountry() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel$Action$LoadingFailure;", "Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel$Action;", "()V", "feature_currencyconverter_debug"})
        public static final class LoadingFailure implements com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel.Action {
            @org.jetbrains.annotations.NotNull()
            public static final com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel.Action.LoadingFailure INSTANCE = null;
            
            private LoadingFailure() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel$Action$Loading;", "Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel$Action;", "()V", "feature_currencyconverter_debug"})
        public static final class Loading implements com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel.Action {
            @org.jetbrains.annotations.NotNull()
            public static final com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel.Action.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
    }
}