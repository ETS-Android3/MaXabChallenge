package com.example.feature_currencyconverter.presentation.currencies.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.core.base.presentation.navigation.NavManager
import com.example.core.base.presentation.viewmodel.BaseViewModel
import com.example.feature_currencyconverter.domain.model.Country
import com.example.feature_currencyconverter.domain.model.CountryRate
import com.example.feature_currencyconverter.domain.model.toCountryRateConverter
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
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.RegisterExtension

internal class CurrenciesViewModelTest : BaseViewModel<CurrenciesViewModel.ViewState, CurrenciesViewModel.Action>(
    CurrenciesViewModel.ViewState()
){

    @ExperimentalCoroutinesApi
    @JvmField
    @RegisterExtension
    val coroutinesTestExtension = CoroutinesTestExtension()

    @JvmField
    @RegisterExtension
    var instantTaskExecutorExtension = InstantTaskExecutorExtension()

    @MockK
    internal lateinit var mockGetCurrenciesUseCase: GetCurrenciesUseCase

    @MockK(relaxed = true)
    internal lateinit var mockNavManager: NavManager

    private lateinit var cut: CurrenciesViewModel

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)

        cut = CurrenciesViewModel(mockGetCurrenciesUseCase)
    }

    @Test
    fun `execute getAlbumUseCase`() {
        // when
        cut.loadData()

        // then
        coVerify { mockGetCurrenciesUseCase.execute() }
    }

    @Test
    fun `navigate to album details`() {
        // given
        val baseCurrency = CountryRate("EUR",15.0)
        val selectedCurrency =  CountryRate("EGP",5.0)
        val countryRateConverter = baseCurrency.toCountryRateConverter(selectedCurrency)

        val navDirections = CurrenciesFragmentDirections
            .actionCurrenciesFragmentToConvertFragment(countryRateConverter)

        coEvery {stateLiveData.value?.country?.selectedCountry } returns "EUR"
        coEvery {stateLiveData.value?.country?.rates?.find { it.iso == "EUR" } } returns baseCurrency

        // when
        cut.navigateToConvertCurrency(selectedCurrency)

        // then
        coVerify { mockNavManager.navigate(navDirections) }
    }

    @Test
    fun `verify state when GetAlbumListUseCase returns empty list`() {
        // given
        coEvery { mockGetCurrenciesUseCase.execute() } returns GetCurrenciesUseCase.Result.Success(null)

        // when
        cut.loadData()

        // then
        cut.stateLiveData.value shouldBeEqualTo CurrenciesViewModel.ViewState(
            isLoading = false,
            isError = true,
            country = null
        )
    }

    @Test
    fun `verify state when GetAlbumListUseCase returns non-empty list`() {
        // given
        val country = Country("EUR", mutableListOf(CountryRate()))
        coEvery { mockGetCurrenciesUseCase.execute() } returns GetCurrenciesUseCase.Result.Success(country)

        // when
        cut.loadData()

        // then
        cut.stateLiveData.value shouldBeEqualTo CurrenciesViewModel.ViewState(
            isLoading = false,
            isError = false,
            country = country
        )
    }

    override fun onReduceState(viewAction: CurrenciesViewModel.Action): CurrenciesViewModel.ViewState {
        return CurrenciesViewModel.ViewState()
    }
}
