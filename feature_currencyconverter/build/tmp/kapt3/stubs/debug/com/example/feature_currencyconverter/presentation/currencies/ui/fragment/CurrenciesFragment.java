package com.example.feature_currencyconverter.presentation.currencies.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0002J$\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001aH\u0014J\u0012\u0010+\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/example/feature_currencyconverter/presentation/currencies/ui/fragment/CurrenciesFragment;", "Lcom/example/core/base/presentation/fragment/BaseFragment;", "()V", "binding", "Lcom/example/feature_currencyconverter/databinding/FragmentCurrenciesBinding;", "currenciesAdapter", "Lcom/example/feature_currencyconverter/presentation/currencies/ui/adapter/CurrenciesAdapter;", "getCurrenciesAdapter", "()Lcom/example/feature_currencyconverter/presentation/currencies/ui/adapter/CurrenciesAdapter;", "currenciesAdapter$delegate", "Lkotlin/Lazy;", "currenciesViewModel", "Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel;", "getCurrenciesViewModel", "()Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel;", "currenciesViewModel$delegate", "currenciesViewModelFactory", "Lcom/example/core/di/ViewModelFactory;", "getCurrenciesViewModelFactory$feature_currencyconverter_debug", "()Lcom/example/core/di/ViewModelFactory;", "setCurrenciesViewModelFactory$feature_currencyconverter_debug", "(Lcom/example/core/di/ViewModelFactory;)V", "stateObserver", "Landroidx/lifecycle/Observer;", "Lcom/example/feature_currencyconverter/presentation/currencies/viewmodel/CurrenciesViewModel$ViewState;", "init", "", "initCurrenciesRv", "onAttach", "context", "Landroid/content/Context;", "onCountrySelected", "countryRate", "Lcom/example/feature_currencyconverter/domain/model/CountryRate;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewClicked", "setData", "country", "Lcom/example/feature_currencyconverter/domain/model/Country;", "feature_currencyconverter_debug"})
public final class CurrenciesFragment extends com.example.core.base.presentation.fragment.BaseFragment {
    private com.example.feature_currencyconverter.databinding.FragmentCurrenciesBinding binding;
    private final kotlin.Lazy currenciesAdapter$delegate = null;
    @javax.inject.Inject()
    public com.example.core.di.ViewModelFactory<com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel> currenciesViewModelFactory;
    private final kotlin.Lazy currenciesViewModel$delegate = null;
    private final androidx.lifecycle.Observer<com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel.ViewState> stateObserver = null;
    
    public CurrenciesFragment() {
        super();
    }
    
    private final com.example.feature_currencyconverter.presentation.currencies.ui.adapter.CurrenciesAdapter getCurrenciesAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.core.di.ViewModelFactory<com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel> getCurrenciesViewModelFactory$feature_currencyconverter_debug() {
        return null;
    }
    
    public final void setCurrenciesViewModelFactory$feature_currencyconverter_debug(@org.jetbrains.annotations.NotNull()
    com.example.core.di.ViewModelFactory<com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel> p0) {
    }
    
    private final com.example.feature_currencyconverter.presentation.currencies.viewmodel.CurrenciesViewModel getCurrenciesViewModel() {
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
    
    private final void setData(com.example.feature_currencyconverter.domain.model.Country country) {
    }
    
    @java.lang.Override()
    protected void init() {
    }
    
    @java.lang.Override()
    protected void onViewClicked() {
    }
    
    private final void initCurrenciesRv() {
    }
    
    private final void onCountrySelected(com.example.feature_currencyconverter.domain.model.CountryRate countryRate) {
    }
}