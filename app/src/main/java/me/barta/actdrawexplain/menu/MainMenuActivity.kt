package me.barta.actdrawexplain.menu

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import me.barta.actdrawexplain.R
import me.barta.actdrawexplain.databinding.ActivityMainMenuBinding

class MainMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpBinding()
    }

    private fun setUpBinding() {
        val binding = DataBindingUtil.setContentView<ActivityMainMenuBinding>(this, R.layout.activity_main_menu)
        val viewModel = MainMenuViewModel()
        binding.viewModel = viewModel
    }
}
