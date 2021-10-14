package com.example.feature_currencyconverter.presentation.currencies.di

import android.content.Context
import androidx.room.Room
import com.example.feature_currencyconverter.data.CurrenciesRepositoryImpl
import com.example.feature_currencyconverter.data.local.CurrenciesDao
import com.example.feature_currencyconverter.data.local.CurrencyConverterDatabase
import com.example.feature_currencyconverter.data.remote.service.CurrenciesAPIService
import com.example.feature_currencyconverter.domain.repository.CurrenciesRepository
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit


@Module
class CurrenciesModule {

    @Provides
    internal fun provideCountriesAPIService(retrofit: Retrofit.Builder): CurrenciesAPIService {
        return retrofit
            .build()
            .create(CurrenciesAPIService::class.java)
    }

    @Provides
    internal fun provideCurrencyConverterDatabase(context: Context): CurrencyConverterDatabase {
        return Room.databaseBuilder(context, CurrencyConverterDatabase::class.java,
            "${CurrencyConverterDatabase::class.simpleName}.db")
            .fallbackToDestructiveMigration()
            .build()
    }


    @Provides
    internal fun provideAlbumDao(currencyConverterDatabase: CurrencyConverterDatabase): CurrenciesDao {
        return currencyConverterDatabase.countries()
    }

    @Provides
    internal fun provideAlbumRepository(
        currenciesAPIService: CurrenciesAPIService,
        currenciesDao: CurrenciesDao
    ): CurrenciesRepository =
        CurrenciesRepositoryImpl(currenciesAPIService,currenciesDao)
}
