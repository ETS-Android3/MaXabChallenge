package com.example.feature_currencyconverter.domain.model

internal data class Country(
    val selectedCountry: String? = null,
    val rates: MutableList<CountryRate> = mutableListOf()
)
