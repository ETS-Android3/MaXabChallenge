package com.example.feature_currencyconverter.domain.model

internal data class Currency(
    val selectedCountry: String? = null,
    val rates: MutableList<CurrencyRate> = mutableListOf()
)
