package me.barta.actdrawexplain.menu

import android.databinding.DataBindingUtil
import android.os.Bundle
import me.barta.actdrawexplain.R
import me.barta.actdrawexplain.databinding.ActivityMainMenuBinding
import me.barta.actdrawexplain.inject.activity.ViewModelActivity

/**
 * Activity for the main menu screen.
 */

class MainMenuActivity : ViewModelActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpBinding()
    }

    private fun setUpBinding() {
        val binding = DataBindingUtil.setContentView<ActivityMainMenuBinding>(this, R.layout.activity_main_menu)
        binding.viewModel = viewModel as MainMenuViewModel?
    }

    override fun createViewModel() : MainMenuViewModel {
        return MainMenuViewModel(activityComponent)
    }
}
