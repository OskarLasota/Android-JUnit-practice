package com.frezzcoding.practice

import com.frezzcoding.practice.di.AppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerAppCompatActivity_MembersInjector
import dagger.android.support.DaggerApplication

class BaseApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>? {
        return null;
    }
}