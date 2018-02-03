package com.masaibar.mvpsample.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {

    //todo 多分不要
    @Binds
    abstract fun bindContext(application: Application): Context
}