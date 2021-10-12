package com.example.core.base.presentation.navigation

import androidx.navigation.NavDirections
import javax.inject.Inject

class NavManager @Inject constructor(){
    private var navEventListener: ((navDirections: NavDirections) -> Unit)? = null

    fun navigate(navDirections: NavDirections) {
        navEventListener?.invoke(navDirections)
    }

    fun setOnNavEvent(navEventListener: (navDirections: NavDirections) -> Unit) {
        this.navEventListener = navEventListener
    }
}
