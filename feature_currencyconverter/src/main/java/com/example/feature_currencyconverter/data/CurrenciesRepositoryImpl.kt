package com.example.feature_currencyconverter.data

import com.example.feature_currencyconverter.data.local.CountriesDao
import com.example.feature_currencyconverter.data.remote.service.CountriesAPIService
import javax.inject.Inject

internal class CurrenciesRepositoryImpl @Inject constructor(
    private val countriesAPIService: CountriesAPIService,
    private val countriesDao: CountriesDao) {


}
