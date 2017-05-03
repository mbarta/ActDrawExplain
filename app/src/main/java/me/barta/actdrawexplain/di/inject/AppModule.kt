package me.barta.actdrawexplain.di.inject

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by milan on 5/3/17.
 */

@Module
class AppModule(private val appContext : Context) {

    @Provides
    @Singleton
    @AppContext
    fun provideAppContext() : Context {
        return appContext
    }
}