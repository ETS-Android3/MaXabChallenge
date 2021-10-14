package com.example.feature_currencyconverter.presentation.currencies.viewmodel

import androidx.lifecycle.viewModelScope
import com.example.core.base.presentation.navigation.NavManager
import com.example.core.base.presentation.viewmodel.BaseAction
import com.example.core.base.presentation.viewmodel.BaseViewModel
import com.example.core.base.presentation.viewmodel.BaseViewState
import com.example.feature_currencyconverter.domain.model.Country
import com.example.feature_currencyconverter.domain.model.CountryRate
import com.example.feature_currencyconverter.domain.model.toCountryRateConverter
import com.example.feature_currencyconverter.domain.usecase.GetCurrenciesUseCase
import com.example.feature_currencyconverter.domain.usecase.GetBaseCurrencyUseCase
import com.example.feature_currencyconverter.presentation.convert.model.CountryRateConverter
import com.example.feature_currencyconverter.presentation.currencies.ui.fragment.CurrenciesFragmentDirections
import kotlinx.coroutines.launch
import javax.inject.Inject

internal class CurrenciesViewModel @Inject constructor(
    private val getCurrenciesUseCase: GetCurrenciesUseCase,
    private val getBaseCurrencyUseCase: GetBaseCurrencyUseCase
) : BaseViewModel<CurrenciesViewModel.ViewState, CurrenciesViewModel.Action>(ViewState()) {

    override fun onLoadData() {
        getCurrenciesList()
    }

    override fun onReduceState(viewAction: Action) = when (viewAction) {
        is Action.LoadingSuccess -> state.copy(
            isLoading = false,
            isError = false,
            country = viewAction.country
        )
        is Action.LoadingFailure -> state.copy(
            isLoading = false,
            isError = true,
            country = null
        )
        Action.Loading -> state.copy(
            isLoading = true,
            isError = false,
            country = null
        )
    }

    private fun getCurrenciesList() {
        viewModelScope.launch {
            getCurrenciesUseCase.execute().also { result ->
                val action = handleResultState(result)
                sendAction(action)
            }
        }
    }

    private fun handleResultState(result: GetCurrenciesUseCase.Result) =
        when (result) {
            is GetCurrenciesUseCase.Result.Success ->
                if (result.data == null || result.data.rates.isEmpty()) {
                    Action.LoadingFailure
                } else {
                    Action.LoadingSuccess(result.data)
                }

            is GetCurrenciesUseCase.Result.Error ->
                Action.LoadingFailure
        }

    private suspend fun getBaseCountry(): CountryRate? {
        var baseCountry: CountryRate? = null
            getBaseCurrencyUseCase.execute().also { result ->
                when (result) {
                    is GetBaseCurrencyUseCase.Result.Error -> sendAction(Action.LoadingFailure)
                    is GetBaseCurrencyUseCase.Result.Success -> {
                        baseCountry = result.data

                    }
                }
            }
        return baseCountry
    }

    fun navigateToConvertCurrency(selectedCountry: CountryRate) {
        viewModelScope.launch {
            getBaseCountry()?.let { baseCountry ->
                if (selectedCountry.iso != baseCountry.iso) {
                    val navDirections = CurrenciesFragmentDirections
                        .actionCurrenciesFragmentToConvertFragment(
                            buildCountryRateConverter(baseCountry, selectedCountry)
                        )
                    NavManager.navigate(navDirections)
                }
            }
        }
    }


    private fun buildCountryRateConverter(
        baseCountry: CountryRate?,
        selectedCountry: CountryRate
    ) =
        baseCountry?.toCountryRateConverter(selectedCountry)!!


    internal data class ViewState(
        val isLoading: Boolean = true,
        val isError: Boolean = false,
        val country: Country? = null
    ) : BaseViewState

    internal sealed interface Action : BaseAction {
        class LoadingSuccess(val country: Country) : Action
        object LoadingFailure : Action
        object Loading : Action
    }

    init {
        sendAction(Action.Loading)
        loadData()
    }

}
