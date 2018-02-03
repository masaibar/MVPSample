package com.masaibar.mvpsample.di

import com.masaibar.mvpsample.main.MainActivity
import com.masaibar.mvpsample.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [(MainModule::class)])
    internal abstract fun mainActivity(): MainActivity
}