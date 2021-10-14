package com.example.feature_currencyconverter.presentation.convert.viewmodel


import com.example.core.base.presentation.viewmodel.BaseAction
import com.example.core.base.presentation.viewmodel.BaseViewModel
import com.example.core.base.presentation.viewmodel.BaseViewState
import com.example.feature_currencyconverter.domain.usecase.ConvertCurrencyUseCase
import javax.inject.Inject

internal class ConvertCurrencyViewModel @Inject constructor(
    private val convertCurrencyUseCase: ConvertCurrencyUseCase
) : BaseViewModel<ConvertCurrencyViewModel.ViewState, ConvertCurrencyViewModel.Action>(ViewState()) {

    fun convert(amount: Double, selectedCurrencyRate: Double) {
        if (amount <= 0.0)
            sendAction(Action.Failure)
        else
            sendAction(Action.Valid(convertCurrencyUseCase.execute(amount, selectedCurrencyRate)))
    }


    internal data class ViewState(
        val isError: Boolean = false,
        val isValid: String = "0.0"
    ) : BaseViewState

    internal sealed interface Action : BaseAction {
        class Valid(val result: String = "0.0") : Action
        object Failure : Action
    }

    override fun onReduceState(viewAction: Action) = when (viewAction) {
        Action.Failure ->  state.copy(
            isValid = "0.0",
            isError = true,
        )
        is Action.Valid -> state.copy(
            isValid = viewAction.result,
            isError = false
        )
    }

}
