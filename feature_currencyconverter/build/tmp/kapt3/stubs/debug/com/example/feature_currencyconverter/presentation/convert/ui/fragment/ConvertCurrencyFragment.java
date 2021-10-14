package com.example.feature_currencyconverter.presentation.convert.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0014J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u001aH\u0002J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00128\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006-"}, d2 = {"Lcom/example/feature_currencyconverter/presentation/convert/ui/fragment/ConvertCurrencyFragment;", "Lcom/example/core/base/presentation/fragment/BaseFragment;", "()V", "args", "Lcom/example/feature_currencyconverter/presentation/convert/ui/fragment/ConvertCurrencyFragmentArgs;", "getArgs", "()Lcom/example/feature_currencyconverter/presentation/convert/ui/fragment/ConvertCurrencyFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/example/feature_currencyconverter/databinding/FragmentConvertCurrencyBinding;", "convertCurrencyViewModel", "Lcom/example/feature_currencyconverter/presentation/convert/viewmodel/ConvertCurrencyViewModel;", "getConvertCurrencyViewModel", "()Lcom/example/feature_currencyconverter/presentation/convert/viewmodel/ConvertCurrencyViewModel;", "convertCurrencyViewModel$delegate", "Lkotlin/Lazy;", "convertViewModelFactory", "Lcom/example/core/di/ViewModelFactory;", "getConvertViewModelFactory$feature_currencyconverter_debug", "()Lcom/example/core/di/ViewModelFactory;", "setConvertViewModelFactory$feature_currencyconverter_debug", "(Lcom/example/core/di/ViewModelFactory;)V", "convertCurrency", "", "amount", "", "init", "observeBaseCurrencyAmountChange", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setConvertedAmount", "convertedAmount", "setData", "currencyRateConverter", "Lcom/example/feature_currencyconverter/presentation/convert/model/CurrencyRateConverter;", "feature_currencyconverter_debug"})
public final class ConvertCurrencyFragment extends com.example.core.base.presentation.fragment.BaseFragment {
    private com.example.feature_currencyconverter.databinding.FragmentConvertCurrencyBinding binding;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @javax.inject.Inject()
    public com.example.core.di.ViewModelFactory<com.example.feature_currencyconverter.presentation.convert.viewmodel.ConvertCurrencyViewModel> convertViewModelFactory;
    private final kotlin.Lazy convertCurrencyViewModel$delegate = null;
    
    public ConvertCurrencyFragment() {
        super();
    }
    
    private final com.example.feature_currencyconverter.presentation.convert.ui.fragment.ConvertCurrencyFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.core.di.ViewModelFactory<com.example.feature_currencyconverter.presentation.convert.viewmodel.ConvertCurrencyViewModel> getConvertViewModelFactory$feature_currencyconverter_debug() {
        return null;
    }
    
    public final void setConvertViewModelFactory$feature_currencyconverter_debug(@org.jetbrains.annotations.NotNull()
    com.example.core.di.ViewModelFactory<com.example.feature_currencyconverter.presentation.convert.viewmodel.ConvertCurrencyViewModel> p0) {
    }
    
    private final com.example.feature_currencyconverter.presentation.convert.viewmodel.ConvertCurrencyViewModel getConvertCurrencyViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    protected void init() {
    }
    
    private final void observeBaseCurrencyAmountChange() {
    }
    
    private final void convertCurrency(java.lang.String amount) {
    }
    
    private final void setData(com.example.feature_currencyconverter.presentation.convert.model.CurrencyRateConverter currencyRateConverter) {
    }
    
    private final void setConvertedAmount(java.lang.String convertedAmount) {
    }
}