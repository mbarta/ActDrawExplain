package me.barta.actdrawexplain.di.activity

import android.app.Activity
import android.content.Intent

import java.lang.ref.WeakReference

/**
 * Created by milan on 5/3/17.
 */

class AttachedViewModelActivity(activity: ViewModelActivity) : AttachedActivity {

    private val weakActivity: WeakReference<ViewModelActivity> = WeakReference(activity)

    override fun startActivity(activityClass: Class<out Activity>) {
        val activity = weakActivity.get()
        if (activity != null && !activity.isFinishing) {
            activity.startActivity(Intent(activity, activityClass))
        }
    }
}
