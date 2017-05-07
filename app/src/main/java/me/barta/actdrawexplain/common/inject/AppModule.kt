package me.barta.actdrawexplain.common.inject

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Activity module provides Application Context for dependency injection.
 */

@Module
class AppModule(val appContext : Context) {

    @Singleton
    @Provides
    fun provideAppContext() : Context {
        return appContext
    }
}