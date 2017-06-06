package me.barta.actdrawexplain.deckselect

import android.databinding.DataBindingUtil
import android.os.Bundle
import me.barta.actdrawexplain.R
import me.barta.actdrawexplain.common.activity.ViewModelActivity
import me.barta.actdrawexplain.databinding.ActivityDecksSelectBinding

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
        // Have to create the adapter here as RecyclerView.Adapter cannot be easily mocked:
        val deckAdapter = DeckAdapter(emptyList(), activityComponent)
        return DeckSelectViewModel(activityComponent, deckAdapter)
    }
}
