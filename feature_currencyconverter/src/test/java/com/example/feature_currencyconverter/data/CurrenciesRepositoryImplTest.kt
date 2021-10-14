package com.example.feature_currencyconverter.data

import com.example.feature_currencyconverter.data.local.CountriesDao
import com.example.feature_currencyconverter.data.local.model.toDomainModel
import com.example.feature_currencyconverter.data.remote.model.toEntity
import com.example.feature_currencyconverter.data.remote.service.CountriesAPIService
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
    internal lateinit var mockService: CountriesAPIService

    @MockK
    internal lateinit var mockCountriesDao: CountriesDao

    private lateinit var cut: CurrenciesRepositoryImpl

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)

        cut = CurrenciesRepositoryImpl(mockService, mockCountriesDao)
    }


    @Test
    fun `getCurrencies fetches currencies and maps to Model`() {
        // given
        coEvery { mockService.getCountries() } returns DataFixtures.getCountriesResponse()

        coEvery {
            mockCountriesDao.insertCountries(any())
        } returns Unit

        coEvery { mockCountriesDao.getAll() } returns DataFixtures.getCountriesResponse().toEntity()

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

        coEvery { mockService.getCountries() } throws UnknownHostException()
        coEvery { mockCountriesDao.getAll() } returns countryEntities

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

        coEvery { mockCountriesDao.getAll() } returns countryEntity

        // when
        val result = runBlocking { cut.getBaseCurrency() }

        // then
        result shouldBeEqualTo countryEntity.toDomainModel().rates.find { it.iso == baseCountry }
    }
}
