package me.barta.actdrawexplain.di.viewmodel

import android.content.Context
import android.databinding.BaseObservable
import me.barta.actdrawexplain.di.activity.AttachedActivity
import me.barta.actdrawexplain.di.inject.ActivityComponent
import javax.inject.Inject

/**
 * Base ViewModel implementation.
 * Takes care of dependency injection.
 */

open class ViewModel(val activityComponent: ActivityComponent) : BaseObservable() {

    @Inject
    lateinit var appContext: Context

    @Inject
    lateinit var attachedActivity: AttachedActivity

    init {
        inject()
    }

    fun inject() {
        activityComponent.inject(this)
    }
}
