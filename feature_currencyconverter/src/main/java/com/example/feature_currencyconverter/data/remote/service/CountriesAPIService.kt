package com.example.feature_currencyconverter.data.remote.service


import com.example.feature_currencyconverter.data.remote.model.CountriesResponse
import retrofit2.http.POST
import retrofit2.http.Query

internal interface CountriesAPIService {

    @POST("/latest")
    suspend fun getCountries(
        @Query("format") format: Int = 1
    ): CountriesResponse?

}
