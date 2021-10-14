package com.example.feature_currencyconverter.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.feature_currencyconverter.data.local.model.CurrencyEntity

@Dao
internal interface CurrenciesDao {

    @Query("SELECT * FROM currencies")
    suspend fun getAll(): CurrencyEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCountries(currency: CurrencyEntity)
}
