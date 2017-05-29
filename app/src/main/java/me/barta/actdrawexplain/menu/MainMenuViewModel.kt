package me.barta.actdrawexplain.menu

import me.barta.actdrawexplain.common.inject.ActivityComponent
import me.barta.actdrawexplain.common.viewmodel.ViewModel
import me.barta.actdrawexplain.deckselect.DeckSelectActivity

/**
 * View model for the main menu screen.
 */
class MainMenuViewModel(activityComponent: ActivityComponent) : ViewModel(activityComponent) {

    override fun inject() {
        activityComponent.inject(this)
    }

    fun onPlayClicked() {
        attachedActivity.startActivity(DeckSelectActivity::class.java)
    }

    fun onCustomizeDecksClicked() {

    }

    fun onExitClicked() {
        attachedActivity.finish()
    }
}