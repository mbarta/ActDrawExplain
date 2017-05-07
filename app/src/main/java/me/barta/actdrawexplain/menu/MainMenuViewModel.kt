package me.barta.actdrawexplain.menu

import me.barta.actdrawexplain.inject.inject.ActivityComponent
import me.barta.actdrawexplain.inject.viewmodel.ViewModel

/**
 * View model for the main menu screen.
 */
class MainMenuViewModel(activityComponent: ActivityComponent) : ViewModel(activityComponent) {

    fun onPlayClicked() {
        attachedActivity.startActivity(DeckSelectActivity::class.java)
    }

    fun onCustomizeDecksClicked() {

    }

    fun onExitClicked() {
        attachedActivity.finish()
    }
}