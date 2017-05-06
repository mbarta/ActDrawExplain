package me.barta.actdrawexplain.menu

import me.barta.actdrawexplain.di.inject.ActivityComponent
import me.barta.actdrawexplain.di.viewmodel.ViewModel

/**
 * View model for the main menu screen.
 */
class MainMenuViewModel(activityComponent: ActivityComponent) : ViewModel(activityComponent) {

    fun onPlayClicked() {

    }

    fun onCustomizeDecksClicked() {

    }

    fun onExitClicked() {
        attachedActivity.finish()
    }
}