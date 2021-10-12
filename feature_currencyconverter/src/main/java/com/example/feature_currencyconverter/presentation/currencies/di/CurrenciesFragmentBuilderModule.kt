package com.example.feature_currencyconverter.presentation.currencies.di

import com.example.feature_currencyconverter.presentation.currencies.ui.fragment.CurrenciesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class CurrenciesFragmentBuilderModule {

    @ContributesAndroidInjector(
        modules = [CurrenciesModule::class]
    )
    abstract fun provideCurrenciesFragment(): CurrenciesFragment
}
