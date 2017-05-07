package me.barta.actdrawexplain.common.activity

import android.app.Activity
import android.content.Intent
import java.lang.ref.WeakReference

/**
* Implementation of AttachedActivity interface for interaction with Activities from ViewModels
*/

class AttachedViewModelActivity(activity: ViewModelActivity) : AttachedActivity {

    private val weakActivity: WeakReference<ViewModelActivity> = WeakReference(activity)

    fun getActivity() : Activity? {
        weakActivity.get()?.let {
            return if (!it.isFinishing) it else null
        }
        return null
    }

    override fun startActivity(activityClass: Class<out Activity>) {
        getActivity()?.let {
            it.startActivity(Intent(it, activityClass))
        }
    }

    override fun finish() {
        getActivity()?.finish()
    }
}
