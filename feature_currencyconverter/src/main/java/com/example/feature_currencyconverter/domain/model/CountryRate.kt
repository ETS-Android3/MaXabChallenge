package com.example.feature_currencyconverter.domain.model

import com.example.feature_currencyconverter.presentation.convert.model.CountryRateConverter

data class CountryRate(
    val iso: String? = null,
    val rate: Double? = null
)


internal fun CountryRate.toCountryRateConverter(selectedCountry: CountryRate) =
    CountryRateConverter(
        this.iso,
        this.rate,
        selectedCountry.iso,
        selectedCountry.rate
    )

