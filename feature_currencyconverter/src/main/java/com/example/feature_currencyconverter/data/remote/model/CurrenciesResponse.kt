package com.example.feature_currencyconverter.data.remote.model

import com.example.feature_currencyconverter.data.local.model.CurrencyEntity
import com.squareup.moshi.Json

internal data class CurrenciesResponse(
    @field:Json(name = "success") val success: Boolean = false,
    @field:Json(name = "timestamp") val timestamp: Long = 0,
    @field:Json(name = "base") val base: String? = null,
    @field:Json(name = "date") val date: String? = null,
    @field:Json(name = "rates") val rates:Map<String, Double>? = null
)


internal fun CurrenciesResponse.toEntity() =
    CurrencyEntity(
        timestamp = this.timestamp,
        base = this.base,
        date = this.date,
        rates = this.rates
    )
