package com.example.feature_currencyconverter.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.feature_currencyconverter.data.local.model.CountryEntity
import com.example.feature_currencyconverter.domain.model.Country

@Dao
internal interface CountriesDao {

    @Query("SELECT * FROM countries")
    suspend fun getAll(): CountryEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCountries(country: CountryEntity)
}
