package com.example.feature_currencyconverter.domain.repository

import com.example.feature_currencyconverter.domain.model.Currency
import com.example.feature_currencyconverter.domain.model.CurrencyRate

internal interface  CurrenciesRepository {

    suspend fun getCurrencies(): Currency?

    suspend fun getBaseCurrency(): CurrencyRate?
}
