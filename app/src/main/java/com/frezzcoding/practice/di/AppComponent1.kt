package com.frezzcoding.practice.di

import android.app.Application
import com.frezzcoding.practice.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [AndroidSupportInjectionModule::class])
interface AppComponent1 : AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application : Application) : Builder

        fun build() : AppComponent1
    }

}