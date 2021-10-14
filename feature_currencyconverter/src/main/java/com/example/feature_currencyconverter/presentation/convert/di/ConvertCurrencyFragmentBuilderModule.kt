package com.example.feature_currencyconverter.presentation.convert.di

import com.example.feature_currencyconverter.presentation.convert.ui.fragment.ConvertCurrencyFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ConvertCurrencyFragmentBuilderModule {
    @ContributesAndroidInjector(
        modules = [ConvertCurrencyModule::class]
    )
    abstract fun provideConvertCurrencyFragment(): ConvertCurrencyFragment
}
