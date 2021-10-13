package com.example.feature_currencyconverter.data.remote.model

import com.example.feature_currencyconverter.data.DataFixtures
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

internal class CountriesResponseTest{

    @Test
    fun `data model with full data maps to toEntity`() {
        // given
        val cut = DataFixtures.getCountriesResponse()

        // when
        val entityModel = cut.toEntity()

        // then
        entityModel shouldBeEqualTo CountriesResponse(
            cut.success,
            cut.timestamp,
            cut.base,
            cut.date,
            cut.rates)
    }

    @Test
    fun `data model with missing data maps to toEntity`() {
        // given
        val cut = DataFixtures.getCountriesResponse()

        // when
        val entityModel = cut.toEntity()

        // then
        entityModel shouldBeEqualTo CountriesResponse(
            cut.success,
            cut.timestamp,
            null,
            cut.date,
            cut.rates)
    }

}
