package com.example.feature_currencyconverter.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.core.base.extension.round
import com.example.feature_currencyconverter.domain.model.Country
import com.example.feature_currencyconverter.domain.model.CountryRate

@Entity(tableName = "countries")
@TypeConverters(CountryRateEntityTypeConverter::class)
internal data class CountryEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val timestamp: Long = 0,
    val base: String? = null,
    val date: String? = null,
    val rates: Map<String, Double>? = null
)

internal fun CountryEntity?.toDomainModel() =
    Country(
        selectedCountry = this?.base,
        rates = this?.rates?.toDomainModel()?: mutableListOf()
    )

internal fun Map<String, Double>.toDomainModel() = map {
        CountryRate(
            iso = it.key,
            rate = it.value.round(2)
        )
    }.toMutableList()


internal class CountryRateEntityTypeConverter {
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
