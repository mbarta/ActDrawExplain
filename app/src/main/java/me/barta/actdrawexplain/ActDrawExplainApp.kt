package me.barta.actdrawexplain

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration
import me.barta.actdrawexplain.inject.inject.AppComponent
import me.barta.actdrawexplain.inject.inject.AppModule
import me.barta.actdrawexplain.inject.inject.DaggerAppComponent
import timber.log.Timber

/**
 * Custom Application implementation.
 */

class ActDrawExplainApp : Application() {

    lateinit var appComponent : AppComponent

    override fun onCreate() {
        super.onCreate()

        // Logging
        Timber.plant(Timber.DebugTree())

        // Realm DB
        Realm.init(this)

        val realmConfigBuilder = RealmConfiguration.Builder()
                .name("actdrawexplain.realm")
                .schemaVersion(0)
        Realm.setDefaultConfiguration(realmConfigBuilder.build())

        // Dependency injection
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(applicationContext))
                .build()
    }
}
