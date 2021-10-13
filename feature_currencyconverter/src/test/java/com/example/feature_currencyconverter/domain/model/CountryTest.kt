package com.example.feature_currencyconverter.domain.model

import com.example.feature_currencyconverter.domain.DomainFixtures
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

internal class CountryTest{

    private lateinit var cut: Country

    @Test
    fun `model has base country`() {
        // given
        val baseCountry = DomainFixtures.getCountry().selectedCountry

        // when
        cut = DomainFixtures.getCountry(baseCountry)

        // then
        cut.selectedCountry shouldBeEqualTo baseCountry
    }

    @Test
    fun `model has null base country`() {
        // given
        cut = DomainFixtures.getCountry(null)

        // then
        cut.selectedCountry shouldBeEqualTo null
    }

    @Test
    fun `model has rates`() {
        // given
        val rates = DomainFixtures.getCountry().rates

        // when
        cut = DomainFixtures.getCountry(rates = rates)

        // then
        cut.rates shouldBeEqualTo rates
    }

    @Test
    fun `model has empty rates`() {
        // given
        cut = DomainFixtures.getCountry(rates= mutableListOf())

        // then
        cut.rates shouldBeEqualTo mutableListOf()
    }

}
