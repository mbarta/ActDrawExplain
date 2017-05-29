package me.barta.actdrawexplain.menu

import me.barta.actdrawexplain.common.inject.ActivityComponent
import me.barta.actdrawexplain.common.viewmodel.ViewModel
import me.barta.actdrawexplain.datastorage.GameProvider
import me.barta.actdrawexplain.deckselect.DeckSelectActivity
import javax.inject.Inject

/**
 * View model for the main menu screen.
 */
class MainMenuViewModel(activityComponent: ActivityComponent) : ViewModel(activityComponent) {

    @Inject
    lateinit var gameProvider: GameProvider

    override fun inject() {
        activityComponent.inject(this)
    }

    fun onPlayClicked() {
        gameProvider.createNewGame()
        attachedActivity.startActivity(DeckSelectActivity::class.java)
    }

    fun onCustomizeDecksClicked() {

    }

    fun onExitClicked() {
        attachedActivity.finish()
    }
}