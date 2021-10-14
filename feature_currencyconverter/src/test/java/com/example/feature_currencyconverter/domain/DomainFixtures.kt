package com.example.feature_currencyconverter.domain

import com.example.feature_currencyconverter.domain.model.Country
import com.example.feature_currencyconverter.domain.model.CountryRate

object DomainFixtures {

    internal fun getCountry(
         selectedCountry: String? = "selectedCountry",
         rates: MutableList<CountryRate> = mutableListOf(CountryRate("iso",0.11))
    ): Country = Country(selectedCountry, rates)


    internal fun getRates(): MutableList<CountryRate> {

      return  mutableListOf(CountryRate("EUR",15.0),CountryRate("EGP",1.0))

    }
}
