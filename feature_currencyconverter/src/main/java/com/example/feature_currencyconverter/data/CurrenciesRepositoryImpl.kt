package com.example.feature_currencyconverter.data

import android.util.Log
import com.example.feature_currencyconverter.data.local.CountriesDao
import com.example.feature_currencyconverter.data.local.model.toDomainModel
import com.example.feature_currencyconverter.data.remote.model.toEntity
import com.example.feature_currencyconverter.data.remote.service.CountriesAPIService
import com.example.feature_currencyconverter.domain.model.Country
import com.example.feature_currencyconverter.domain.repository.CurrenciesRepository
import java.net.UnknownHostException
import javax.inject.Inject

internal class CurrenciesRepositoryImpl @Inject constructor(
    private val countriesAPIService: CountriesAPIService,
    private val countriesDao: CountriesDao
) : CurrenciesRepository {


    override suspend fun getCurrencies(): Country? {
        return try {
          /*  val apiResponse = countriesAPIService.getCountries()
            return if (apiResponse.success) {
                apiResponse.toEntity()
                    .let { countriesDao.insertCountries(it) }
                apiResponse.toEntity().toDomainModel()
            } else*/
                countriesDao.getAll().toDomainModel()
        } catch (e: UnknownHostException) {
            countriesDao.getAll().toDomainModel()
        }
    }
}
