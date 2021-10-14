// Generated by Dagger (https://dagger.dev).
package com.example.feature_currencyconverter.presentation.currencies.di;

import com.example.feature_currencyconverter.data.local.CurrenciesDao;
import com.example.feature_currencyconverter.data.remote.service.CurrenciesAPIService;
import com.example.feature_currencyconverter.domain.repository.CurrenciesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CurrenciesModule_ProvideAlbumRepository$feature_currencyconverter_debugFactory implements Factory<CurrenciesRepository> {
  private final CurrenciesModule module;

  private final Provider<CurrenciesAPIService> currenciesAPIServiceProvider;

  private final Provider<CurrenciesDao> currenciesDaoProvider;

  public CurrenciesModule_ProvideAlbumRepository$feature_currencyconverter_debugFactory(
      CurrenciesModule module, Provider<CurrenciesAPIService> currenciesAPIServiceProvider,
      Provider<CurrenciesDao> currenciesDaoProvider) {
    this.module = module;
    this.currenciesAPIServiceProvider = currenciesAPIServiceProvider;
    this.currenciesDaoProvider = currenciesDaoProvider;
  }

  @Override
  public CurrenciesRepository get() {
    return provideAlbumRepository$feature_currencyconverter_debug(module, currenciesAPIServiceProvider.get(), currenciesDaoProvider.get());
  }

  public static CurrenciesModule_ProvideAlbumRepository$feature_currencyconverter_debugFactory create(
      CurrenciesModule module, Provider<CurrenciesAPIService> currenciesAPIServiceProvider,
      Provider<CurrenciesDao> currenciesDaoProvider) {
    return new CurrenciesModule_ProvideAlbumRepository$feature_currencyconverter_debugFactory(module, currenciesAPIServiceProvider, currenciesDaoProvider);
  }

  public static CurrenciesRepository provideAlbumRepository$feature_currencyconverter_debug(
      CurrenciesModule instance, CurrenciesAPIService currenciesAPIService,
      CurrenciesDao currenciesDao) {
    return Preconditions.checkNotNullFromProvides(instance.provideAlbumRepository$feature_currencyconverter_debug(currenciesAPIService, currenciesDao));
  }
}
