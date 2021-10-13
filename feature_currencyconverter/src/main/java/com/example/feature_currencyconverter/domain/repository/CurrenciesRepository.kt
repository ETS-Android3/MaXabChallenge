package com.example.feature_currencyconverter.domain.repository

import com.example.feature_currencyconverter.domain.model.Country

internal interface  CurrenciesRepository {

    suspend fun getCurrencies(): Country?

}
