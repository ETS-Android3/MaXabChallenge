package com.example.feature_currencyconverter.presentation.currencies.di

import android.content.Context
import androidx.room.Room
import com.example.feature_currencyconverter.data.CurrenciesRepositoryImpl
import com.example.feature_currencyconverter.data.local.CountriesDao
import com.example.feature_currencyconverter.data.local.CurrencyConverterDatabase
import com.example.feature_currencyconverter.data.remote.service.CountriesAPIService
import com.example.feature_currencyconverter.domain.repository.CurrenciesRepository
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit


@Module
class CurrenciesModule {

    @Provides
    internal fun provideCountriesAPIService(retrofit: Retrofit.Builder): CountriesAPIService {
        return retrofit
            .build()
            .create(CountriesAPIService::class.java)
    }

    @Provides
    internal fun provideCurrencyConverterDatabase(context: Context): CurrencyConverterDatabase {
        return Room.databaseBuilder(context, CurrencyConverterDatabase::class.java,
            "${CurrencyConverterDatabase::class.simpleName}.db")
            .fallbackToDestructiveMigration()
            .build()
    }


    @Provides
    internal fun provideAlbumDao(currencyConverterDatabase: CurrencyConverterDatabase): CountriesDao {
        return currencyConverterDatabase.countries()
    }

    @Provides
    internal fun provideAlbumRepository(
        countriesAPIService: CountriesAPIService,
        countriesDao: CountriesDao
    ): CurrenciesRepository =
        CurrenciesRepositoryImpl(countriesAPIService,countriesDao)
}
