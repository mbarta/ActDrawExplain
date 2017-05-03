package me.barta.actdrawexplain.di.activity

import android.app.Activity

/**
 * Created by milan on 5/3/17.
 */

interface AttachedActivity {
    fun startActivity(activityClass: Class<out Activity>)
}
