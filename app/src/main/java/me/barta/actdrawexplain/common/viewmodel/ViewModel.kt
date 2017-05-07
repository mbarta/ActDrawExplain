package me.barta.actdrawexplain.common.viewmodel

import android.content.Context
import android.databinding.BaseObservable
import me.barta.actdrawexplain.common.activity.AttachedActivity
import me.barta.actdrawexplain.common.inject.ActivityComponent
import javax.inject.Inject

/**
 * Base ViewModel implementation.
 * Takes care of dependency injection.
 */

abstract class ViewModel(val activityComponent: ActivityComponent) : BaseObservable() {

    @Inject
    lateinit var appContext: Context

    @Inject
    lateinit var attachedActivity: AttachedActivity

    init {
        inject()
    }

    abstract fun inject()
}
