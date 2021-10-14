package com.example.core.base.extension

import java.math.RoundingMode

fun Double.round(places: Int): Double {
  return  this.toBigDecimal().setScale(places, RoundingMode.UP).toDouble()
}
