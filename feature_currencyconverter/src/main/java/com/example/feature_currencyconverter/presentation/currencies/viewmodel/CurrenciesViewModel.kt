package com.example.feature_currencyconverter.presentation.currencies.viewmodel

import androidx.lifecycle.viewModelScope
import com.example.core.base.presentation.navigation.NavManager
import com.example.core.base.presentation.viewmodel.BaseAction
import com.example.core.base.presentation.viewmodel.BaseViewModel
import com.example.core.base.presentation.viewmodel.BaseViewState
import com.example.feature_currencyconverter.domain.model.Country
import com.example.feature_currencyconverter.domain.usecase.GetCurrenciesUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

internal class CurrenciesViewModel @Inject constructor(
    private val navManager: NavManager,
    private val getCurrenciesUseCase: GetCurrenciesUseCase
) : BaseViewModel<CurrenciesViewModel.ViewState, CurrenciesViewModel.Action>(ViewState()) {


    override fun onLoadData() {
        getCurrenciesList()
    }

    override fun onReduceState(viewAction: Action) = when (viewAction) {
        is Action.AlbumListLoadingSuccess -> state.copy(
            isLoading = false,
            isError = false,
            albums = viewAction.albums
        )
        is Action.AlbumListLoadingFailure -> state.copy(
            isLoading = false,
            isError = true,
            albums = null
        )
    }

    private fun getCurrenciesList() {
        viewModelScope.launch {
            getCurrenciesUseCase.execute().also { result ->
                val action = when (result) {
                    is GetCurrenciesUseCase.Result.Success ->
                        if (result.data == null) {
                            Action.AlbumListLoadingFailure
                        } else {
                            Action.AlbumListLoadingSuccess(result.data)
                        }

                    is GetCurrenciesUseCase.Result.Error ->
                        Action.AlbumListLoadingFailure
                }
                sendAction(action)
            }
        }
    }


    internal data class ViewState(
        val isLoading: Boolean = true,
        val isError: Boolean = false,
        val albums: Country? = null
    ) : BaseViewState

    internal sealed interface Action : BaseAction {
        class AlbumListLoadingSuccess(val albums: Country) : Action
        object AlbumListLoadingFailure : Action
    }


}
