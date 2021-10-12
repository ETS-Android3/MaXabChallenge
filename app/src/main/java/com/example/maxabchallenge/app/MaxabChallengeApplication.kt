package com.example.maxabchallenge.app

import android.app.Application
import com.example.core.di.BaseComponentProvider
import com.example.core.di.component.BaseComponent
import com.example.core.di.component.DaggerBaseComponent
import com.example.core.di.utils.InjectUtils
import com.example.maxabchallenge.app.di.DaggerAppComponent
import com.google.android.play.core.splitcompat.SplitCompatApplication
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MaxabChallengeApplication :
    Application() ,
    HasAndroidInjector,
    BaseComponentProvider {

    @Inject
    lateinit var androidInjector : DispatchingAndroidInjector<Any>

    private var baseComponent: BaseComponent? = null


    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }

    override fun onCreate() {
        super.onCreate()
        initDaggerAppComponent()
    }

    private fun initDaggerAppComponent() {
        baseComponent = DaggerBaseComponent
            .builder()
            .application(this)
            .build()
        baseComponent?.inject(this)

    }

    override fun provideBaseComponent(): BaseComponent {
        return baseComponent!!
    }
}
