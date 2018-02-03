package com.masaibar.mvpsample.di

import android.content.Context
import com.masaibar.mvpsample.main.MainRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object RepositoriesModule {

    @JvmStatic
    @Provides
    @Singleton
    fun provideMainRepository(context: Context): MainRepository {
        return MainRepository(context)
    }
}