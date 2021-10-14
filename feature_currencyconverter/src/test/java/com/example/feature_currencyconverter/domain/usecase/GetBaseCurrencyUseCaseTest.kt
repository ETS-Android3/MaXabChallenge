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


internal class GetBaseCurrencyUseCaseTest {

    @MockK
    internal lateinit var mockCurrenciesRepository: CurrenciesRepository

    private lateinit var cut: GetBaseCurrencyUseCase

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)

        cut = GetBaseCurrencyUseCase(mockCurrenciesRepository)
    }

    @Test
    fun `return countryRate`() {
        // given
        val countryRate = DomainFixtures.getRates().first()
        coEvery { mockCurrenciesRepository.getBaseCurrency() } returns countryRate

        // when
        val result = runBlocking { cut.execute() }

        // then
        result shouldBeEqualTo GetBaseCurrencyUseCase.Result.Success(countryRate)
    }


    @Test
    fun `return error when repository throws an exception`() {
        // given
        val exception = Exception()
        coEvery { mockCurrenciesRepository.getBaseCurrency() } throws exception

        // when
        val result = runBlocking { cut.execute() }

        // then
        result shouldBeEqualTo GetBaseCurrencyUseCase.Result.Error(exception)
    }
}
