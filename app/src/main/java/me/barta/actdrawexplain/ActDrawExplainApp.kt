package me.barta.actdrawexplain

import android.app.Application
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
        Timber.plant(Timber.DebugTree())

        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(applicationContext))
                .build()
    }
}
