package com.example.feature_currencyconverter.presentation.currencies.viewmodel

import com.example.core.base.presentation.navigation.NavManager
import com.example.feature_currencyconverter.domain.model.Currency
import com.example.feature_currencyconverter.domain.model.CurrencyRate
import com.example.feature_currencyconverter.domain.model.toCountryRateConverter
import com.example.feature_currencyconverter.domain.usecase.GetBaseCurrencyUseCase
import com.example.feature_currencyconverter.domain.usecase.GetCurrenciesUseCase
import com.example.feature_currencyconverter.presentation.currencies.ui.fragment.CurrenciesFragmentDirections
import com.example.library_test_utils.testutils.CoroutinesTestExtension
import com.example.library_test_utils.testutils.InstantTaskExecutorExtension
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.RegisterExtension

internal class CurrenciesViewModelTest {

    @ExperimentalCoroutinesApi
    @JvmField
    @RegisterExtension
    val coroutinesTestExtension = CoroutinesTestExtension()

    @JvmField
    @RegisterExtension
    var instantTaskExecutorExtension = InstantTaskExecutorExtension()

    @MockK
    internal lateinit var mockGetCurrenciesUseCase: GetCurrenciesUseCase

    @MockK
    internal lateinit var mockGetBaseCurrencyUseCase: GetBaseCurrencyUseCase

    @MockK(relaxed = true)
    internal lateinit var mockNavManager: NavManager

    private lateinit var cut: CurrenciesViewModel

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)

        cut = CurrenciesViewModel(mockGetCurrenciesUseCase, mockGetBaseCurrencyUseCase)
    }

    @Test
    fun `execute getCurrenciesList`() {
        // when
        cut.loadData()

        // then
        coVerify { mockGetCurrenciesUseCase.execute() }
    }

    @Test
    fun `navigate to convert currency`() {
        // given
        val baseCurrency = CurrencyRate("EUR", 15.0)
        val selectedCurrency = CurrencyRate("EGP", 5.0)
        val countryRateConverter = baseCurrency.toCountryRateConverter(selectedCurrency)

        val navDirections = CurrenciesFragmentDirections
            .actionCurrenciesFragmentToConvertFragment(countryRateConverter)

        coEvery { mockGetBaseCurrencyUseCase.execute() } returns GetBaseCurrencyUseCase.Result.Success(baseCurrency)
        cut.baseCurrency = baseCurrency
        // when
        cut.navigateToConvertCurrency(selectedCurrency)

        // then
        coVerify { mockNavManager.navigate(navDirections) }
    }

    @Test
    fun `verify state when getCurrenciesList returns null`() {
        // given
        coEvery { mockGetCurrenciesUseCase.execute() } returns GetCurrenciesUseCase.Result.Success(null)

        // when
        cut.loadData()

        // then
        cut.stateLiveData.value shouldBeEqualTo CurrenciesViewModel.ViewState(
            isLoading = false,
            isError = true,
            currency = null
        )
    }

    @Test
    fun `verify state when getCurrenciesList returns data`() {
        // given
        val country = Currency("EUR", mutableListOf(CurrencyRate()))
        coEvery { mockGetCurrenciesUseCase.execute() } returns GetCurrenciesUseCase.Result.Success(country)

        // when
        cut.loadData()

        // then
        cut.stateLiveData.value shouldBeEqualTo CurrenciesViewModel.ViewState(
            isLoading = false,
            isError = false,
            currency = country
        )
    }
}
