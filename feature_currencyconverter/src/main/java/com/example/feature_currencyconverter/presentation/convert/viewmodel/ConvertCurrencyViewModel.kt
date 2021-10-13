package com.example.feature_currencyconverter.presentation.convert.viewmodel

import androidx.lifecycle.ViewModel
import com.example.feature_currencyconverter.domain.usecase.ConvertCurrencyUseCase
import javax.inject.Inject

internal class ConvertCurrencyViewModel @Inject constructor(
    private val convertCurrencyUseCase: ConvertCurrencyUseCase
) : ViewModel() {

    fun convert(amount: Double,selectedCurrencyRate: Double): String {
        return convertCurrencyUseCase.execute(amount,selectedCurrencyRate)
    }


}
