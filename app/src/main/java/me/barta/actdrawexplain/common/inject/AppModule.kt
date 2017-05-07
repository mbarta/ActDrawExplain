package me.barta.actdrawexplain.common.inject

import android.content.Context
import dagger.Module
import dagger.Provides
import me.barta.actdrawexplain.datastorage.DefaultStorageManager
import me.barta.actdrawexplain.datastorage.StorageManager
import javax.inject.Singleton

/**
 * Activity module provides Application Context for dependency injection.
 */

@Singleton
@Module
class AppModule(val appContext : Context) {

    @Singleton
    @Provides
    fun provideAppContext() : Context {
        return appContext
    }

    @Singleton
    @Provides
    fun provideStorageManager() : StorageManager {
        return DefaultStorageManager(appContext)
    }
}