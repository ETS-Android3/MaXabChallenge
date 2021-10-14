package com.example.feature_currencyconverter.presentation.convert.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.feature_currencyconverter.presentation.convert.model.CurrencyRateConverter
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ConvertCurrencyFragmentArgs(
  public val countryConverter: CurrencyRateConverter
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ConvertCurrencyFragmentArgs {
      bundle.setClassLoader(ConvertCurrencyFragmentArgs::class.java.classLoader)
      val __countryConverter : CurrencyRateConverter?
      if (bundle.containsKey("countryConverter")) {
        if (Parcelable::class.java.isAssignableFrom(CurrencyRateConverter::class.java) ||
            Serializable::class.java.isAssignableFrom(CurrencyRateConverter::class.java)) {
          __countryConverter = bundle.get("countryConverter") as CurrencyRateConverter?
        } else {
          throw UnsupportedOperationException(CurrencyRateConverter::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__countryConverter == null) {
          throw IllegalArgumentException("Argument \"countryConverter\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"countryConverter\" is missing and does not have an android:defaultValue")
      }
      return ConvertCurrencyFragmentArgs(__countryConverter)
    }
  }
}
