package com.example.feature_currencyconverter.domain.usecase

import com.example.feature_currencyconverter.domain.DomainFixtures
import com.example.feature_currencyconverter.domain.repository.CurrenciesRepository
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.net.UnknownHostException

internal class GetCurrenciesUseCaseTest {

    @MockK
    internal lateinit var mockCurrenciesRepository: CurrenciesRepository

    private lateinit var cut: GetCurrenciesUseCase

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)

        cut = GetCurrenciesUseCase(mockCurrenciesRepository)
    }

    @Test
    fun `return country`() {
        // given
        val country = DomainFixtures.getCountry()
        coEvery { mockCurrenciesRepository.getCurrencies() } returns country

        // when
        val result = runBlocking { cut.execute() }

        // then
        result shouldBeEqualTo GetCurrenciesUseCase.Result.Success(country)
    }


    @Test
    fun `return error when repository throws an exception`() {
        // given
        val exception = UnknownHostException()
        coEvery { mockCurrenciesRepository.getCurrencies() } throws exception

        // when
        val result = runBlocking { cut.execute() }

        // then
        result shouldBeEqualTo GetCurrenciesUseCase.Result.Error(exception)
    }
}
