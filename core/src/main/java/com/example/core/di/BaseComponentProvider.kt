package com.example.core.di

import com.example.core.di.component.BaseComponent

interface BaseComponentProvider {

    fun provideBaseComponent(): BaseComponent

}
