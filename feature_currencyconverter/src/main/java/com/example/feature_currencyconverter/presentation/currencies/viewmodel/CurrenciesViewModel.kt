package com.example.feature_currencyconverter.presentation.currencies.viewmodel

import androidx.lifecycle.viewModelScope
import com.example.core.base.presentation.navigation.NavManager
import com.example.core.base.presentation.viewmodel.BaseAction
import com.example.core.base.presentation.viewmodel.BaseViewModel
import com.example.core.base.presentation.viewmodel.BaseViewState
import com.example.feature_currencyconverter.domain.model.Currency
import com.example.feature_currencyconverter.domain.model.CurrencyRate
import com.example.feature_currencyconverter.domain.model.toCountryRateConverter
import com.example.feature_currencyconverter.domain.usecase.GetCurrenciesUseCase
import com.example.feature_currencyconverter.domain.usecase.GetBaseCurrencyUseCase
import com.example.feature_currencyconverter.presentation.currencies.ui.fragment.CurrenciesFragmentDirections
import kotlinx.coroutines.launch
import javax.inject.Inject

internal class CurrenciesViewModel @Inject constructor(
    private val getCurrenciesUseCase: GetCurrenciesUseCase,
    private val getBaseCurrencyUseCase: GetBaseCurrencyUseCase
) : BaseViewModel<CurrenciesViewModel.ViewState, CurrenciesViewModel.Action>(ViewState()) {

    var baseCurrency: CurrencyRate? = null

    override fun onLoadData() {
        getCurrenciesList()
    }

    override fun onReduceState(viewAction: Action) = when (viewAction) {
        is Action.LoadingSuccess -> state.copy(
            isLoading = false,
            isError = false,
            currency = viewAction.currency
        )
        is Action.LoadingFailure -> state.copy(
            isLoading = false,
            isError = true,
            currency = null
        )
        Action.Loading -> state.copy(
            isLoading = true,
            isError = false,
            currency = null
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

    private suspend fun getBaseCountry(): CurrencyRate? {
        return if (baseCurrency != null) {
            baseCurrency
        } else {
            getBaseCurrencyUseCase.execute().also { result ->
                when (result) {
                    is GetBaseCurrencyUseCase.Result.Error -> sendAction(Action.LoadingFailure)
                    is GetBaseCurrencyUseCase.Result.Success -> {
                        baseCurrency = result.data

                    }
                }
            }
            baseCurrency
        }
    }

    fun navigateToConvertCurrency(selectedCurrency: CurrencyRate) {
        viewModelScope.launch {
            getBaseCountry()?.let { baseCountry ->
                if (selectedCurrency.iso != baseCountry.iso) {
                    val navDirections = CurrenciesFragmentDirections
                        .actionCurrenciesFragmentToConvertFragment(
                            buildCountryRateConverter(baseCountry, selectedCurrency)
                        )
                    NavManager.navigate(navDirections)
                }
            }
        }
    }

    private fun buildCountryRateConverter(
        baseCurrency: CurrencyRate?,
        selectedCurrency: CurrencyRate
    ) =
        baseCurrency?.toCountryRateConverter(selectedCurrency)!!

    internal data class ViewState(
        val isLoading: Boolean = true,
        val isError: Boolean = false,
        val currency: Currency? = null
    ) : BaseViewState

    internal sealed interface Action : BaseAction {
        class LoadingSuccess(val currency: Currency) : Action
        object LoadingFailure : Action
        object Loading : Action
    }

    init {
        sendAction(Action.Loading)
        loadData()
    }

}
