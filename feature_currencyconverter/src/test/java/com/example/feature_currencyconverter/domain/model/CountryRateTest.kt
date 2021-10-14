package com.example.feature_currencyconverter.domain.model


import com.example.feature_currencyconverter.domain.DomainFixtures
import com.example.feature_currencyconverter.presentation.convert.model.CountryRateConverter
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

internal class CountryRateTest {

    private lateinit var cut: CountryRate

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
        countryRateModel shouldBeEqualTo CountryRateConverter(
            countryRate.iso,
            countryRate.rate,
            selectedCountry.iso,
            selectedCountry.rate

        )
    }

}
