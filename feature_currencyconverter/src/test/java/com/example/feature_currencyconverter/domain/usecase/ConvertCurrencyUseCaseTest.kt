package com.example.feature_currencyconverter.domain.usecase

import com.example.core.base.extension.round
import com.example.feature_currencyconverter.domain.DomainFixtures
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Test


internal class ConvertCurrencyUseCaseTest {


    private lateinit var cut: ConvertCurrencyUseCase

    @BeforeEach
    fun setUp() {
        cut = ConvertCurrencyUseCase()
    }

    @Test
    fun `execute return conversion`() {
        // given
        val rates = DomainFixtures.getRates()
        val amount = 50.0
        val selectedCurrency = rates.last().rate?:0.0

        // when
        val result = runBlocking { cut.execute(amount, selectedCurrency) }

        // then
        result shouldBeEqualTo (amount*selectedCurrency).round(2).toString()
    }

}
