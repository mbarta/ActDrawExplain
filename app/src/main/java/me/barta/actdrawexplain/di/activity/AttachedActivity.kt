package me.barta.actdrawexplain.di.activity

import android.app.Activity

/**
 * Interface for interaction with Activities from ViewModels
 */

interface AttachedActivity {
    fun startActivity(activityClass: Class<out Activity>)
    fun finish()
}
