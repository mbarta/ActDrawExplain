package me.barta.actdrawexplain.common.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import me.barta.actdrawexplain.ActDrawExplainApp
import me.barta.actdrawexplain.common.inject.ActivityComponent
import me.barta.actdrawexplain.common.inject.ActivityModule
import me.barta.actdrawexplain.common.inject.DaggerActivityComponent
import me.barta.actdrawexplain.common.viewmodel.ViewModel

/**
 * Base Activity implementation.
 * Takes care of setting up dependency injection and fullscreen immersive mode.
 */

abstract class ViewModelActivity : AppCompatActivity() {

    lateinit var activityComponent : ActivityComponent
    lateinit var viewModel : ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hideSystemUI()

        val appComponent = (application as ActDrawExplainApp).appComponent
        appComponent.inject(this)

        activityComponent = DaggerActivityComponent.builder()
                .appComponent(appComponent)
                .activityModule(ActivityModule(this))
                .build()

        viewModel = createViewModel()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            hideSystemUI()
        }
    }

    private fun hideSystemUI() {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_FULLSCREEN or
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
    }

    abstract fun createViewModel(): ViewModel
}
