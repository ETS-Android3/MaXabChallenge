package com.example.feature_currencyconverter.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity(tableName = "countries")
internal data class CountryEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val timestamp: Long,
    val base: String,
    val date: String,
    val rates: List<Pair<String, Double>>
)
