package me.barta.actdrawexplain.common.inject

import android.content.Context
import dagger.Module
import dagger.Provides
import me.barta.actdrawexplain.database.realm.RealmDatabase
import me.barta.actdrawexplain.datastorage.GameProvider
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
    fun provideGameProvider() : GameProvider {
        return GameProvider(appContext)
    }

    @Singleton
    @Provides
    fun provideRealmDatabase() : RealmDatabase {
        return RealmDatabase()
    }
}