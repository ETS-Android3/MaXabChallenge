package com.example.feature_currencyconverter.domain.usecase

import com.example.core.base.extension.round
import javax.inject.Inject

class ConvertCurrencyUseCase @Inject constructor() {

    fun execute(amount: Double,selectedCurrencyRate: Double): String {
        return (amount * selectedCurrencyRate).round(2).toString()
    }
}
