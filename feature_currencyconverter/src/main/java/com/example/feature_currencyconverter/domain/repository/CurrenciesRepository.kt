package com.example.feature_currencyconverter.domain.repository

import com.example.feature_currencyconverter.domain.model.Country
import com.example.feature_currencyconverter.domain.model.CountryRate

internal interface  CurrenciesRepository {

    suspend fun getCurrencies(): Country?

    suspend fun getBaseCurrency(): CountryRate?
}
