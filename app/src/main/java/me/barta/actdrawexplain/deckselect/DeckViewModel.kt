package me.barta.actdrawexplain.deckselect

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import me.barta.actdrawexplain.common.inject.ActivityComponent
import me.barta.actdrawexplain.common.viewmodel.ViewModel
import me.barta.actdrawexplain.datamodel.database.Deck

/**
 * Deck ViewModel used for displaying deck information.
 */

class DeckViewModel(activityComponent: ActivityComponent, val deck: Deck) : ViewModel(activityComponent) {

    override fun inject() {
        activityComponent.inject(this)
    }

}