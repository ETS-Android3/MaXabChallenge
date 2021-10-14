package com.example.feature_currencyconverter.data.local.model.converter

import androidx.room.TypeConverter

internal class CurrencyRateEntityTypeConverter {
    private val KEY_VALUE_SEPARATOR = "="
    private val ENTRY_SEPARATOR = "||"

    @TypeConverter
    fun mapToString(map: Map<String?, Double>): String {
        return map.entries.joinToString(separator = ENTRY_SEPARATOR) {
            "${it.key}$KEY_VALUE_SEPARATOR${it.value}"
        }
    }

    @TypeConverter
    fun stringToMap(string: String): Map<String, Double> {
        return string.split(ENTRY_SEPARATOR).map {
            val (key, value) = it.split(KEY_VALUE_SEPARATOR)
            key to value
        }.toMap()
            .mapValues { it.value.toDouble() }
    }
}
