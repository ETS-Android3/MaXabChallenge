package com.example.feature_currencyconverter.presentation.convert.viewmodel

import com.example.core.base.extension.round
import com.example.feature_currencyconverter.domain.DomainFixtures
import com.example.feature_currencyconverter.domain.usecase.ConvertCurrencyUseCase
import com.example.library_test_utils.testutils.InstantTaskExecutorExtension
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.MockK
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.RegisterExtension

internal class ConvertCurrencyViewModelTest {


    @JvmField
    @RegisterExtension
    var instantTaskExecutorExtension = InstantTaskExecutorExtension()


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
        cut.convert(amount, selectedCurrency)

        // then
        coVerify { mockConvertCurrencyUseCase.execute(amount, selectedCurrency) }
    }


    @Test
    fun `verify state when convertCurrency returns error`() {
        // given
        val rates = DomainFixtures.getRates()
        val amount = 0.0
        val selectedCurrency = rates.last().rate ?: 0.0
        coEvery {
            mockConvertCurrencyUseCase.execute(
                amount,
                selectedCurrency
            )
        } returns (amount * selectedCurrency).round(2).toString()

        // when
        cut.convert(amount, selectedCurrency)

        // then
        cut.stateLiveData.value shouldBeEqualTo ConvertCurrencyViewModel.ViewState(
            isError = true,
            isValid = "0.0"
        )
    }

    @Test
    fun `verify state when convertCurrency returns result`() {
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
        cut.convert(amount, selectedCurrency)

        // then
        cut.stateLiveData.value shouldBeEqualTo ConvertCurrencyViewModel.ViewState(
            isValid = (amount * selectedCurrency).round(2).toString(),
            isError = false
        )
    }
}
