package com.example.feature_currencyconverter.domain.usecase

import javax.inject.Inject

class ConvertCurrencyUseCase @Inject constructor() {

    fun execute(amount: Double,selectedCurrencyRate: Double): String {
        return (amount * selectedCurrencyRate).toString()
    }
}
