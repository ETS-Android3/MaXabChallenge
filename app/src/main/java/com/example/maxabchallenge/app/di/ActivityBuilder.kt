package com.example.maxabchallenge.app.di


import com.example.maxabchallenge.presentation.NavHostActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {


    @ContributesAndroidInjector
    abstract fun bindNavHostActivity(): NavHostActivity

}