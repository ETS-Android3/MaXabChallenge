package com.example.feature_currencyconverter.presentation.convert.di;

import com.example.feature_currencyconverter.presentation.convert.ui.fragment.ConvertCurrencyFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ConvertCurrencyFragmentBuilderModule_ProvideConvertCurrencyFragment
          .ConvertCurrencyFragmentSubcomponent.class
)
public abstract class ConvertCurrencyFragmentBuilderModule_ProvideConvertCurrencyFragment {
  private ConvertCurrencyFragmentBuilderModule_ProvideConvertCurrencyFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ConvertCurrencyFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ConvertCurrencyFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = ConvertCurrencyModule.class)
  public interface ConvertCurrencyFragmentSubcomponent
      extends AndroidInjector<ConvertCurrencyFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ConvertCurrencyFragment> {}
  }
}
