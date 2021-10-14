package com.example.feature_currencyconverter.domain

import com.example.feature_currencyconverter.domain.model.Currency
import com.example.feature_currencyconverter.domain.model.CurrencyRate

object DomainFixtures {

    internal fun getCountry(
         selectedCountry: String? = "selectedCountry",
         rates: MutableList<CurrencyRate> = mutableListOf(CurrencyRate("iso",0.11))
    ): Currency = Currency(selectedCountry, rates)


    internal fun getRates(): MutableList<CurrencyRate> {

      return  mutableListOf(CurrencyRate("EUR",15.0),CurrencyRate("EGP",1.0))

    }
}
