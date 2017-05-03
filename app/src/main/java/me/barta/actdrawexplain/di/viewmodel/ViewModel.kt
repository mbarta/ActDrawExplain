package me.barta.actdrawexplain.di.viewmodel

import android.content.Context
import android.databinding.BaseObservable
import me.barta.actdrawexplain.di.activity.AttachedActivity
import me.barta.actdrawexplain.di.inject.ActivityComponent
import me.barta.actdrawexplain.di.inject.AppContext
import javax.inject.Inject

/**
 * Created by milan on 5/3/17.
 */

abstract class ViewModel constructor(activityComponent: ActivityComponent) : BaseObservable() {

    @Inject
    lateinit var attachedActivity: AttachedActivity

    @Inject
    @AppContext
    lateinit var appContext : Context

    init {
        activityComponent.inject(this)
    }
}
