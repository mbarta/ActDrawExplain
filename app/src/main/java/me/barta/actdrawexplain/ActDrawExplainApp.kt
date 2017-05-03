package me.barta.actdrawexplain

import android.app.Application
import me.barta.actdrawexplain.di.inject.AppComponent
import me.barta.actdrawexplain.di.inject.AppModule
import me.barta.actdrawexplain.di.inject.DaggerAppComponent
import timber.log.Timber

/**
 * Created by milan on 5/3/17.
 */

class ActDrawExplainApp : Application() {

    lateinit var appComponent : AppComponent

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())

        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }
}
