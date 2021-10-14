package com.example.feature_currencyconverter.di.ext

import androidx.fragment.app.FragmentActivity
import com.example.core.base.presentation.activity.BaseActivity
import com.example.core.di.utils.InjectUtils
import com.example.feature_currencyconverter.di.DaggerCurrencyConverterComponent
import com.example.maxabchallenge.app.getMaxabApp


fun FragmentActivity.initCurrencyConverterComponent() {
    DaggerCurrencyConverterComponent
        .builder()
        .application(getMaxabApp())
        .baseComponent(InjectUtils.provideBaseComponent(getMaxabApp()))
        .build()
        .inject(this as BaseActivity)
}
