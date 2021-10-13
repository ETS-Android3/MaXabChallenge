package com.example.feature_currencyconverter.presentation.currencies.di;

import com.example.feature_currencyconverter.presentation.currencies.ui.fragment.CurrenciesFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      CurrenciesFragmentBuilderModule_ProvideCurrenciesFragment.CurrenciesFragmentSubcomponent.class
)
public abstract class CurrenciesFragmentBuilderModule_ProvideCurrenciesFragment {
  private CurrenciesFragmentBuilderModule_ProvideCurrenciesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CurrenciesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CurrenciesFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = CurrenciesModule.class)
  public interface CurrenciesFragmentSubcomponent extends AndroidInjector<CurrenciesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CurrenciesFragment> {}
  }
}
