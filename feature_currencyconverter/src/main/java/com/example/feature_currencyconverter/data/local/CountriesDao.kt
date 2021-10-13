package com.example.feature_currencyconverter.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.feature_currencyconverter.data.local.model.CountryEntity

@Dao
internal interface CountriesDao {

    @Query("SELECT * FROM albums")
    suspend fun getAll(): List<CountryEntity>

    @Query("SELECT * FROM albums where artist = :artistName and name = :albumName and mbId = :mbId")
    suspend fun getAlbum(artistName: String, albumName: String, mbId: String?): CountryEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAlbums(countries: List<CountryEntity>)
}
