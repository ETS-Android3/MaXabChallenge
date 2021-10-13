package com.example.feature_currencyconverter.data.remote.model

import com.squareup.moshi.Json

internal data class CountriesResponse(
    @field:Json(name = "success") val success: Boolean = false,
    @field:Json(name = "timestamp") val timestamp: Long = 0,
    @field:Json(name = "base") val base: String? = null,
    @field:Json(name = "date") val date: String? = null,
    @field:Json(name = "rates") val rates: List<Pair<String, Double>>? = null
)
