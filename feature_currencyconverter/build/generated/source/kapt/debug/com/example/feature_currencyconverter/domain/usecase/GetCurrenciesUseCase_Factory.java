// Generated by Dagger (https://dagger.dev).
package com.example.feature_currencyconverter.domain.usecase;

import com.example.feature_currencyconverter.domain.repository.CurrenciesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetCurrenciesUseCase_Factory implements Factory<GetCurrenciesUseCase> {
  private final Provider<CurrenciesRepository> currenciesRepositoryProvider;

  public GetCurrenciesUseCase_Factory(Provider<CurrenciesRepository> currenciesRepositoryProvider) {
    this.currenciesRepositoryProvider = currenciesRepositoryProvider;
  }

  @Override
  public GetCurrenciesUseCase get() {
    return newInstance(currenciesRepositoryProvider.get());
  }

  public static GetCurrenciesUseCase_Factory create(
      Provider<CurrenciesRepository> currenciesRepositoryProvider) {
    return new GetCurrenciesUseCase_Factory(currenciesRepositoryProvider);
  }

  public static GetCurrenciesUseCase newInstance(CurrenciesRepository currenciesRepository) {
    return new GetCurrenciesUseCase(currenciesRepository);
  }
}
