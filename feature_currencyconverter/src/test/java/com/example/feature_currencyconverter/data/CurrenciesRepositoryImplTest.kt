package com.example.feature_currencyconverter.data

import com.example.feature_currencyconverter.data.local.CurrenciesDao
import com.example.feature_currencyconverter.data.local.model.toDomainModel
import com.example.feature_currencyconverter.data.remote.model.toEntity
import com.example.feature_currencyconverter.data.remote.service.CurrenciesAPIService
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.net.UnknownHostException

internal class CurrenciesRepositoryImplTest{

    @MockK
    internal lateinit var mockService: CurrenciesAPIService

    @MockK
    internal lateinit var mockCurrenciesDao: CurrenciesDao

    private lateinit var cut: CurrenciesRepositoryImpl

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)

        cut = CurrenciesRepositoryImpl(mockService, mockCurrenciesDao)
    }


    @Test
    fun `getCurrencies fetches currencies and maps to Model`() {
        // given
        coEvery { mockService.getCurrencies() } returns DataFixtures.getCountriesResponse()

        coEvery {
            mockCurrenciesDao.insertCountries(any())
        } returns Unit

        coEvery { mockCurrenciesDao.getAll() } returns DataFixtures.getCountriesResponse().toEntity()

        // when
        val result = runBlocking { cut.getCurrencies() }

        // then
        result shouldBeEqualTo DataFixtures.getCountriesResponse().toEntity().toDomainModel()
    }

    @Test
    fun `getCurrencies return data from database if offline`() {
        // given
        val apiResponse = DataFixtures.getCountriesResponse()
        val countryEntities = apiResponse.toEntity()
        val country = apiResponse.toEntity().toDomainModel()

        coEvery { mockService.getCurrencies() } throws UnknownHostException()
        coEvery { mockCurrenciesDao.getAll() } returns countryEntities

        // when
        val result = runBlocking { cut.getCurrencies() }

        // then
        result shouldBeEqualTo country
    }


    @Test
    fun `getBaseCurrency get base currency and maps to Model`() {
        // given
        val countryEntity = DataFixtures.getCountriesResponse().toEntity()
        val baseCountry = countryEntity.base

        coEvery { mockCurrenciesDao.getAll() } returns countryEntity

        // when
        val result = runBlocking { cut.getBaseCurrency() }

        // then
        result shouldBeEqualTo countryEntity.toDomainModel().rates.find { it.iso == baseCountry }
    }
}
