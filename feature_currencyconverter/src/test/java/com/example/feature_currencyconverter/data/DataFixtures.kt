package com.example.feature_currencyconverter.data

import com.example.feature_currencyconverter.data.remote.model.CurrenciesResponse


object DataFixtures {

    internal fun getCountriesResponse(
        success: Boolean = false,
        timestamp: Long = 0,
        base: String? = "base",
        date: String? = "date",
        rates: Map<String, Double>? = mutableMapOf("String" to 0.0, "String" to 0.0, "String" to 0.0)
    ): CurrenciesResponse = CurrenciesResponse(success, timestamp, base, date, rates)


}
