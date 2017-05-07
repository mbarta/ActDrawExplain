package me.barta.actdrawexplain.menu

import android.databinding.DataBindingUtil
import android.os.Bundle
import me.barta.actdrawexplain.R
import me.barta.actdrawexplain.databinding.ActivityDecksSelectBinding
import me.barta.actdrawexplain.inject.activity.ViewModelActivity

/**
 * Activity for the deck select screen.
 */

class DeckSelectActivity : ViewModelActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpBinding()
    }

    private fun setUpBinding() {
        val binding = DataBindingUtil.setContentView<ActivityDecksSelectBinding>(this, R.layout.activity_decks_select)
        binding.viewModel = viewModel as DeckSelectViewModel?
    }

    override fun createViewModel() : DeckSelectViewModel {
        return DeckSelectViewModel(activityComponent)
    }
}
