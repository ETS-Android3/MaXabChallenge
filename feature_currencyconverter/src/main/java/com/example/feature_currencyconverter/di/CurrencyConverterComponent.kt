package com.example.feature_currencyconverter.di

import android.app.Application
import com.example.core.base.presentation.activity.BaseActivity
import com.example.core.di.component.BaseComponent
import com.example.core.di.module.BaseModule
import com.example.feature_currencyconverter.di.scopes.CurrencyConverterScope
import com.example.feature_currencyconverter.presentation.convert.di.ConvertCurrencyFragmentBuilderModule
import com.example.feature_currencyconverter.presentation.currencies.di.CurrenciesFragmentBuilderModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule


@CurrencyConverterScope
@Component(
    dependencies = [BaseComponent::class],
    modules = [
        AndroidSupportInjectionModule::class,
        CurrenciesFragmentBuilderModule::class,
        ConvertCurrencyFragmentBuilderModule::class,
        BaseModule::class]
)
interface CurrencyConverterComponent {
    fun inject(fragment: BaseActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun baseComponent(component: BaseComponent): Builder

        fun build(): CurrencyConverterComponent
    }
}

