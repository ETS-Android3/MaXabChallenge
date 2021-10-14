package com.example.feature_currencyconverter.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.core.base.extension.round
import com.example.feature_currencyconverter.data.local.model.converter.CurrencyRateEntityTypeConverter
import com.example.feature_currencyconverter.domain.model.Currency
import com.example.feature_currencyconverter.domain.model.CurrencyRate

@Entity(tableName = "currencies")
@TypeConverters(CurrencyRateEntityTypeConverter::class)
internal data class CurrencyEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val timestamp: Long = 0,
    val base: String? = null,
    val date: String? = null,
    val rates: Map<String, Double>? = null
)

internal fun CurrencyEntity?.toDomainModel() =
    Currency(
        selectedCountry = this?.base,
        rates = this?.rates?.toDomainModel()?: mutableListOf()
    )

internal fun Map<String, Double>.toDomainModel() = map {
        CurrencyRate(
            iso = it.key,
            rate = it.value.round(2)
        )
    }.toMutableList()


