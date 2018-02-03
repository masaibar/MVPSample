package com.masaibar.mvpsample.di

import android.content.Context
import com.masaibar.mvpsample.main.MainRepository
import dagger.Module
import dagger.Provides

@Module
object RepositoriesModule {

    @JvmStatic
    @Provides
    fun provideMainRepository(context: Context): MainRepository {
        return MainRepository(context)
    }
}