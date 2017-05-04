package me.barta.actdrawexplain.di.inject

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by milan on 5/3/17.
 */

@Module
class AppModule(val appContext : Context) {

    @AppContext
    @Singleton
    @Provides
    fun provideAppContext() : Context {
        return appContext
    }
}