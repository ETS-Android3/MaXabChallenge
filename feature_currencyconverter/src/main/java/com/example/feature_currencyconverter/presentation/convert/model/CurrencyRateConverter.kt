package com.example.feature_currencyconverter.presentation.convert.model

import java.io.Serializable

data class CurrencyRateConverter(
    val baseCountryISO: String? = null,
    val baseCountryRate: Double? = null,
    val selectedCountryISO: String? = null,
    val selectedCountryRate: Double? = null
):Serializable
