package com.example.feature_currencyconverter.data

import com.example.feature_currencyconverter.data.local.CurrenciesDao
import com.example.feature_currencyconverter.data.local.model.toDomainModel
import com.example.feature_currencyconverter.data.remote.model.toEntity
import com.example.feature_currencyconverter.data.remote.service.CurrenciesAPIService
import com.example.feature_currencyconverter.domain.model.Currency
import com.example.feature_currencyconverter.domain.model.CurrencyRate
import com.example.feature_currencyconverter.domain.repository.CurrenciesRepository
import java.net.UnknownHostException
import javax.inject.Inject

internal class CurrenciesRepositoryImpl @Inject constructor(
    private val currenciesAPIService: CurrenciesAPIService,
    private val currenciesDao: CurrenciesDao
) : CurrenciesRepository {

    override suspend fun getCurrencies(): Currency? {
        return try {
            val apiResponse = currenciesAPIService.getCurrencies()
            apiResponse?.let {
                if (apiResponse.success) {
                    val entityModel = apiResponse.toEntity()
                    entityModel.let { currenciesDao.insertCountries(it) }
                }
            }
            currenciesDao.getAll().toDomainModel()
        } catch (e: UnknownHostException) {
            currenciesDao.getAll().toDomainModel()
        }
    }

    override suspend fun getBaseCurrency(): CurrencyRate? {
        val countries = currenciesDao.getAll().toDomainModel()
        val baseCountry = countries.selectedCountry
        return countries.rates.find { it.iso == baseCountry }
    }
}
