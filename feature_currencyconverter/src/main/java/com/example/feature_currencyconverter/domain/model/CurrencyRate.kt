package com.example.feature_currencyconverter.domain.model

import com.example.feature_currencyconverter.presentation.convert.model.CurrencyRateConverter

data class CurrencyRate(
    val iso: String? = null,
    val rate: Double? = null
)


internal fun CurrencyRate.toCountryRateConverter(selectedCurrency: CurrencyRate) =
    CurrencyRateConverter(
        this.iso,
        this.rate,
        selectedCurrency.iso,
        selectedCurrency.rate
    )

