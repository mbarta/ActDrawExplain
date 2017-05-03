package me.barta.actdrawexplain

import android.app.Application
import timber.log.Timber

/**
 * Created by milan on 5/3/17.
 */

class ActDrawExplainApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}
