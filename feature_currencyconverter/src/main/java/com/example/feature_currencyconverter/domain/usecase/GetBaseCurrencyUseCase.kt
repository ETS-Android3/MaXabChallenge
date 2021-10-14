package com.example.feature_currencyconverter.domain.usecase

import com.example.feature_currencyconverter.domain.model.CountryRate
import com.example.feature_currencyconverter.domain.repository.CurrenciesRepository
import java.io.IOException
import javax.inject.Inject

internal class GetBaseCurrencyUseCase @Inject constructor(
    private val currenciesRepository: CurrenciesRepository
) {

    sealed interface Result {
        data class Success(val data: CountryRate?) : Result
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
