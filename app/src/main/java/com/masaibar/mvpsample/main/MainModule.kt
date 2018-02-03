package com.masaibar.mvpsample.main

import android.content.Context
import com.masaibar.mvpsample.di.ActivityScoped
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class MainModule {

    @ActivityScoped
    @Binds
    abstract fun bindView(mainActivity: MainActivity): MainContract.View

    @ActivityScoped
    @Binds
    abstract fun bindPresenter(presenter: MainPresenter): MainContract.Presenter
}