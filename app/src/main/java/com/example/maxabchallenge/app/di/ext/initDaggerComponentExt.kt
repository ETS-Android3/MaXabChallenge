package com.example.maxabchallenge.app.di.ext

import androidx.fragment.app.FragmentActivity
import com.example.core.di.utils.InjectUtils
import com.example.maxabchallenge.app.di.DaggerAppComponent
import com.example.maxabchallenge.app.getMaxabApp


fun FragmentActivity.initAppComponent() {
    DaggerAppComponent
        .builder()
        .application(getMaxabApp())
        .baseComponent(InjectUtils.provideBaseComponent(getMaxabApp()))
        .build()
        .inject(getMaxabApp())
}
