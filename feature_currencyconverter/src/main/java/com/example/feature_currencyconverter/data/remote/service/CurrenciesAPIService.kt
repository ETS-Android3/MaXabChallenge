package com.example.feature_currencyconverter.data.remote.service


import com.example.feature_currencyconverter.data.remote.model.CurrenciesResponse
import retrofit2.http.POST
import retrofit2.http.Query

internal interface CurrenciesAPIService {

    @POST("/latest")
    suspend fun getCurrencies(
        @Query("format") format: Int = 1
    ): CurrenciesResponse?

}
