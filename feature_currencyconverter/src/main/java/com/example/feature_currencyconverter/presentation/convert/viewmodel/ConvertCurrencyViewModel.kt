package com.example.feature_currencyconverter.presentation.convert.viewmodel

import com.example.core.base.presentation.viewmodel.BaseAction
import com.example.core.base.presentation.viewmodel.BaseViewModel
import com.example.core.base.presentation.viewmodel.BaseViewState
import com.example.feature_currencyconverter.domain.model.Country
import com.example.feature_currencyconverter.domain.usecase.ConvertCurrencyUseCase
import javax.inject.Inject

internal class ConvertCurrencyViewModel @Inject constructor(
    private val convertCurrencyUseCase: ConvertCurrencyUseCase
) : BaseViewModel<ConvertCurrencyViewModel.ViewState,
        ConvertCurrencyViewModel.Action>(ViewState()) {

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

    fun convert(amount: Double,selectedCurrencyRate: Double): String {
        return convertCurrencyUseCase.execute(amount,selectedCurrencyRate)
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
