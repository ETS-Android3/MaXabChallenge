package com.example.feature_currencyconverter.domain.usecase

import com.example.feature_currencyconverter.domain.model.Currency
import com.example.feature_currencyconverter.domain.repository.CurrenciesRepository
import java.io.IOException
import javax.inject.Inject

internal class GetCurrenciesUseCase @Inject constructor(
    private val currenciesRepository: CurrenciesRepository
) {

    sealed interface Result {
        data class Success(val data: Currency?) : Result
        data class Error(val e: Throwable) : Result
    }


    suspend fun execute(): Result {
        return try {
            Result.Success(
                currenciesRepository.getCurrencies())
        } catch (e: IOException) {
            Result.Error(e)
        }
    }
}
