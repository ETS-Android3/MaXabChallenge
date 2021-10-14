package com.example.feature_currencyconverter.data

import com.example.feature_currencyconverter.data.local.CountriesDao
import com.example.feature_currencyconverter.data.local.model.toDomainModel
import com.example.feature_currencyconverter.data.remote.model.toEntity
import com.example.feature_currencyconverter.data.remote.service.CountriesAPIService
import com.example.feature_currencyconverter.domain.model.Country
import com.example.feature_currencyconverter.domain.model.CountryRate
import com.example.feature_currencyconverter.domain.repository.CurrenciesRepository
import java.net.UnknownHostException
import javax.inject.Inject

internal class CurrenciesRepositoryImpl @Inject constructor(
    private val countriesAPIService: CountriesAPIService,
    private val countriesDao: CountriesDao
) : CurrenciesRepository {

    override suspend fun getCurrencies(): Country? {
        return try {
            val apiResponse = countriesAPIService.getCountries()
            if (apiResponse.success) {
                val entityModel = apiResponse.toEntity()
                entityModel.let { countriesDao.insertCountries(it) }
            }
            countriesDao.getAll().toDomainModel()
        } catch (e: UnknownHostException) {
            countriesDao.getAll().toDomainModel()
        }
    }

    override suspend fun getBaseCurrency(): CountryRate? {
        val countries = countriesDao.getAll().toDomainModel()
        val baseCountry = countries.selectedCountry
        return countries.rates.find { it.iso == baseCountry }
    }
}
