package com.example.feature_currencyconverter.domain.usecase

import com.example.feature_currencyconverter.domain.model.CurrencyRate
import com.example.feature_currencyconverter.domain.repository.CurrenciesRepository
import javax.inject.Inject

internal class GetBaseCurrencyUseCase @Inject constructor(
    private val currenciesRepository: CurrenciesRepository
) {

    sealed interface Result {
        data class Success(val data: CurrencyRate?) : Result
        data class Error(val e: Throwable) : Result
    }


    suspend fun execute(): Result {
        return try {
            Result.Success(
                currenciesRepository.getBaseCurrency())
        } catch (e: Exception) {
            Result.Error(e)
        }
    }
}
