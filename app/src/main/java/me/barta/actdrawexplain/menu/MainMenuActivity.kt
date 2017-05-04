package me.barta.actdrawexplain.menu

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.View
import me.barta.actdrawexplain.R
import me.barta.actdrawexplain.databinding.ActivityMainMenuBinding
import me.barta.actdrawexplain.di.activity.ViewModelActivity

class MainMenuActivity : ViewModelActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpBinding()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                    View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                    View.SYSTEM_UI_FLAG_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        }
    }

    private fun setUpBinding() {
        val binding = DataBindingUtil.setContentView<ActivityMainMenuBinding>(this, R.layout.activity_main_menu)
        binding.viewModel = viewModel as MainMenuViewModel?
    }

    override fun createViewModel() : MainMenuViewModel {
        return MainMenuViewModel(activityComponent)
    }
}
