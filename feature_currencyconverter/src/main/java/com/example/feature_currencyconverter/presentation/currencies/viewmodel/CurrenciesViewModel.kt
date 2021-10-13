package com.example.feature_currencyconverter.presentation.currencies.viewmodel

import androidx.lifecycle.viewModelScope
import com.example.core.base.presentation.viewmodel.BaseAction
import com.example.core.base.presentation.viewmodel.BaseViewModel
import com.example.core.base.presentation.viewmodel.BaseViewState
import com.example.feature_currencyconverter.domain.model.Country
import com.example.feature_currencyconverter.domain.model.CountryRate
import com.example.feature_currencyconverter.domain.usecase.GetCurrenciesUseCase
import com.example.feature_currencyconverter.presentation.currencies.ui.fragment.CurrenciesFragmentDirections
import com.example.core.base.presentation.navigation.NavManager
import com.example.feature_currencyconverter.domain.model.toCountryRateConverter
import com.example.feature_currencyconverter.presentation.convert.model.CountryRateConverter
import kotlinx.coroutines.launch
import javax.inject.Inject

internal class CurrenciesViewModel @Inject constructor(
    private val getCurrenciesUseCase: GetCurrenciesUseCase
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

    fun navigateToConvertCurrency(selectedCountry: CountryRate) {
        if (selectedCountry.iso != stateLiveData.value?.country?.selectedCountry) {
            val navDirections = CurrenciesFragmentDirections
                .actionCurrenciesFragmentToConvertFragment(buildCountryRateConverter(selectedCountry))
            NavManager.navigate(navDirections)
        }
    }

    private fun buildCountryRateConverter(selectedCountry: CountryRate): CountryRateConverter {
        val baseCountryISOCode = stateLiveData.value?.country?.selectedCountry
        val baseCountry = stateLiveData.value?.country?.rates?.find { it.iso == baseCountryISOCode }
        return baseCountry?.toCountryRateConverter(selectedCountry)!!
    }

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
