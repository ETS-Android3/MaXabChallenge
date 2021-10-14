package com.example.feature_currencyconverter.presentation.convert.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/feature_currencyconverter/presentation/convert/viewmodel/ConvertCurrencyViewModel;", "Lcom/example/core/base/presentation/viewmodel/BaseViewModel;", "Lcom/example/feature_currencyconverter/presentation/convert/viewmodel/ConvertCurrencyViewModel$ViewState;", "Lcom/example/feature_currencyconverter/presentation/convert/viewmodel/ConvertCurrencyViewModel$Action;", "convertCurrencyUseCase", "Lcom/example/feature_currencyconverter/domain/usecase/ConvertCurrencyUseCase;", "(Lcom/example/feature_currencyconverter/domain/usecase/ConvertCurrencyUseCase;)V", "convert", "", "amount", "", "selectedCurrencyRate", "onReduceState", "viewAction", "Action", "ViewState", "feature_currencyconverter_debug"})
public final class ConvertCurrencyViewModel extends com.example.core.base.presentation.viewmodel.BaseViewModel<com.example.feature_currencyconverter.presentation.convert.viewmodel.ConvertCurrencyViewModel.ViewState, com.example.feature_currencyconverter.presentation.convert.viewmodel.ConvertCurrencyViewModel.Action> {
    private final com.example.feature_currencyconverter.domain.usecase.ConvertCurrencyUseCase convertCurrencyUseCase = null;
    
    @javax.inject.Inject()
    public ConvertCurrencyViewModel(@org.jetbrains.annotations.NotNull()
    com.example.feature_currencyconverter.domain.usecase.ConvertCurrencyUseCase convertCurrencyUseCase) {
        super(null);
    }
    
    public final void convert(double amount, double selectedCurrencyRate) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.example.feature_currencyconverter.presentation.convert.viewmodel.ConvertCurrencyViewModel.ViewState onReduceState(@org.jetbrains.annotations.NotNull()
    com.example.feature_currencyconverter.presentation.convert.viewmodel.ConvertCurrencyViewModel.Action viewAction) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/example/feature_currencyconverter/presentation/convert/viewmodel/ConvertCurrencyViewModel$ViewState;", "Lcom/example/core/base/presentation/viewmodel/BaseViewState;", "isError", "", "isValid", "", "(ZLjava/lang/String;)V", "()Z", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature_currencyconverter_debug"})
    public static final class ViewState implements com.example.core.base.presentation.viewmodel.BaseViewState {
        private final boolean isError = false;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String isValid = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.feature_currencyconverter.presentation.convert.viewmodel.ConvertCurrencyViewModel.ViewState copy(boolean isError, @org.jetbrains.annotations.NotNull()
        java.lang.String isValid) {
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
        
        public ViewState(boolean isError, @org.jetbrains.annotations.NotNull()
        java.lang.String isValid) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isError() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String isValid() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/feature_currencyconverter/presentation/convert/viewmodel/ConvertCurrencyViewModel$Action;", "Lcom/example/core/base/presentation/viewmodel/BaseAction;", "Failure", "Valid", "Lcom/example/feature_currencyconverter/presentation/convert/viewmodel/ConvertCurrencyViewModel$Action$Valid;", "Lcom/example/feature_currencyconverter/presentation/convert/viewmodel/ConvertCurrencyViewModel$Action$Failure;", "feature_currencyconverter_debug"})
    public static abstract interface Action extends com.example.core.base.presentation.viewmodel.BaseAction {
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/feature_currencyconverter/presentation/convert/viewmodel/ConvertCurrencyViewModel$Action$Valid;", "Lcom/example/feature_currencyconverter/presentation/convert/viewmodel/ConvertCurrencyViewModel$Action;", "result", "", "(Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "feature_currencyconverter_debug"})
        public static final class Valid implements com.example.feature_currencyconverter.presentation.convert.viewmodel.ConvertCurrencyViewModel.Action {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String result = null;
            
            public Valid() {
                super();
            }
            
            public Valid(@org.jetbrains.annotations.NotNull()
            java.lang.String result) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getResult() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/feature_currencyconverter/presentation/convert/viewmodel/ConvertCurrencyViewModel$Action$Failure;", "Lcom/example/feature_currencyconverter/presentation/convert/viewmodel/ConvertCurrencyViewModel$Action;", "()V", "feature_currencyconverter_debug"})
        public static final class Failure implements com.example.feature_currencyconverter.presentation.convert.viewmodel.ConvertCurrencyViewModel.Action {
            @org.jetbrains.annotations.NotNull()
            public static final com.example.feature_currencyconverter.presentation.convert.viewmodel.ConvertCurrencyViewModel.Action.Failure INSTANCE = null;
            
            private Failure() {
                super();
            }
        }
    }
}