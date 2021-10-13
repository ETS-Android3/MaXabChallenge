package com.example.feature_currencyconverter.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.feature_currencyconverter.data.local.model.CountryEntity

@Database(entities = [CountryEntity::class], version = 1, exportSchema = false)
internal abstract class CurrencyConverterDatabase : RoomDatabase() {

    abstract fun countries(): CountriesDao
}
