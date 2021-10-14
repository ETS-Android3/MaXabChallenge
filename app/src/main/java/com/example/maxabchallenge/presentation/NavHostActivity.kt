package com.example.maxabchallenge.presentation

import android.os.Bundle
import com.example.core.base.delegate.viewBinding
import com.example.core.base.extension.navigateSafe
import com.example.core.base.presentation.activity.BaseActivity
import com.example.core.base.presentation.navigation.NavManager
import com.example.core.di.utils.InjectUtils
import com.example.maxabchallenge.R
import com.example.maxabchallenge.app.di.DaggerAppComponent
import com.example.maxabchallenge.app.getMaxabApp
import com.example.maxabchallenge.databinding.ActivityNavHostBinding

class NavHostActivity : BaseActivity() {

    private val binding: ActivityNavHostBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        initComponent()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initNavManager()
    }

    private fun initComponent() {
        DaggerAppComponent
            .builder()
            .application(getMaxabApp())
            .baseComponent(InjectUtils.provideBaseComponent(getMaxabApp()))
            .build()
            .inject(getMaxabApp())
    }

    private fun initNavManager() {
        NavManager.setOnNavEvent {

            val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment)
            val currentFragment = navHostFragment?.childFragmentManager?.fragments?.get(0)

            currentFragment?.navigateSafe(it)
        }
    }
}
