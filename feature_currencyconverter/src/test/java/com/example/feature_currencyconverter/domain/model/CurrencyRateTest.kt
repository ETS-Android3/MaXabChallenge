package com.example.feature_currencyconverter.domain.model


import com.example.feature_currencyconverter.domain.DomainFixtures
import com.example.feature_currencyconverter.presentation.convert.model.CurrencyRateConverter
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

internal class CurrencyRateTest {

    private lateinit var cut: CurrencyRate

    @Test
    fun `model has rate`() {
        // given
        val countryRate = DomainFixtures.getRates().first()

        // when
        cut = DomainFixtures.getRates().first()

        // then
        cut shouldBeEqualTo countryRate
    }

    @Test
    fun `countryRate model maps to CountryRateConverter`() {
        // given
        val countryRate = DomainFixtures.getRates().first()
        val selectedCountry = DomainFixtures.getRates().first()

        // when
        val countryRateModel = countryRate.toCountryRateConverter(selectedCountry)

        // then
        countryRateModel shouldBeEqualTo CurrencyRateConverter(
            countryRate.iso,
            countryRate.rate,
            selectedCountry.iso,
            selectedCountry.rate

        )
    }

}
