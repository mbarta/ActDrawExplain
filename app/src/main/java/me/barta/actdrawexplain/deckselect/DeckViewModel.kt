package me.barta.actdrawexplain.deckselect

import me.barta.actdrawexplain.common.inject.ActivityComponent
import me.barta.actdrawexplain.common.viewmodel.ViewModel
import me.barta.actdrawexplain.database.Deck

/**
 * Deck ViewModel used for displaying deck information.
 */

class DeckViewModel(activityComponent: ActivityComponent, val deck: Deck, val deckAdapter: DeckAdapter, var checked: Boolean) : ViewModel(activityComponent) {

    override fun inject() {
        activityComponent.inject(this)
    }

    fun onCheckChanged(checked: Boolean) {
        deckAdapter.onCheckChanged(deck, checked)
    }
}