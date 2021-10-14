package com.example.maxabchallenge.app.di

import com.example.core.di.component.BaseComponent
import com.example.maxabchallenge.app.MaxabChallengeApplication
import com.example.maxabchallenge.app.di.scopes.NavHostActivityScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@NavHostActivityScope
@Component(
    dependencies = [BaseComponent::class],
    modules = [AndroidSupportInjectionModule::class,
        ActivityBuilder::class]
)
interface AppComponent {
    fun inject(app: MaxabChallengeApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: MaxabChallengeApplication): Builder

        fun baseComponent(component: BaseComponent): Builder

        fun build(): AppComponent
    }
}
