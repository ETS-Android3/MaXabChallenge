package com.example.feature_currencyconverter.presentation.currencies.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.feature_currencyconverter.R
import com.example.feature_currencyconverter.presentation.convert.model.CurrencyRateConverter
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class CurrenciesFragmentDirections private constructor() {
  private data class ActionCurrenciesFragmentToConvertFragment(
    public val countryConverter: CurrencyRateConverter
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_currenciesFragment_to_convertFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(CurrencyRateConverter::class.java)) {
        result.putParcelable("countryConverter", this.countryConverter as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(CurrencyRateConverter::class.java)) {
        result.putSerializable("countryConverter", this.countryConverter as Serializable)
      } else {
        throw UnsupportedOperationException(CurrencyRateConverter::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionCurrenciesFragmentToConvertFragment(countryConverter: CurrencyRateConverter):
        NavDirections = ActionCurrenciesFragmentToConvertFragment(countryConverter)
  }
}
