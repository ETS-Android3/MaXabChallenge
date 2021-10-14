package com.example.feature_currencyconverter.presentation.convert.viewmodel

import com.example.core.base.extension.round
import com.example.feature_currencyconverter.domain.DomainFixtures
import com.example.feature_currencyconverter.domain.usecase.ConvertCurrencyUseCase
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ConvertCurrencyViewModelTest {


    @MockK
    internal lateinit var mockConvertCurrencyUseCase: ConvertCurrencyUseCase


    private lateinit var cut: ConvertCurrencyViewModel

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)

        cut = ConvertCurrencyViewModel(mockConvertCurrencyUseCase)
    }

    @Test
    fun `verify calling ConvertCurrencyUseCase`() {
        // given
        val rates = DomainFixtures.getRates()
        val amount = 50.0
        val selectedCurrency = rates.last().rate ?: 0.0

        coEvery {
            mockConvertCurrencyUseCase.execute(
                amount,
                selectedCurrency
            )
        } returns (amount * selectedCurrency).round(2).toString()

        // when
        cut.convert(amount,selectedCurrency)

        // then
        coVerify { mockConvertCurrencyUseCase.execute(amount,selectedCurrency) }
    }


}
