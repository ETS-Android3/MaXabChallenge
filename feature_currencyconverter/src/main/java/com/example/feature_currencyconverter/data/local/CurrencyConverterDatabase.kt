package com.example.feature_currencyconverter.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.feature_currencyconverter.data.local.model.CurrencyEntity

@Database(entities = [CurrencyEntity::class], version = 2, exportSchema = false)
internal abstract class CurrencyConverterDatabase : RoomDatabase() {

    abstract fun countries(): CurrenciesDao
}
