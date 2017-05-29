package me.barta.actdrawexplain.menu

import me.barta.actdrawexplain.common.BaseTest
import org.junit.Test
import org.mockito.Mockito

/**
 * Tests for the View model for the main menu screen.
 */

class MainMenuViewModelTest : BaseTest() {

    lateinit var viewModel: MainMenuViewModel

    override fun setup() {
        super.setup()
        viewModel = MainMenuViewModel(testComponent)
    }

    @Test
    fun onPlayClicked_deckSelectionActivityStarts() {
        viewModel.onPlayClicked()
        Mockito.verify(viewModel.gameProvider,
                Mockito.times(1).description("GameProvider should've created a new game.")
        ).createNewGame()
    }

    @Test
    fun onCustomizeDecksClicked_deckCustomizeActivityStarts() {
        viewModel.onCustomizeDecksClicked()
        // TODO: finish test
    }

    @Test
    fun onExitClicked_activityFinishes() {
        viewModel.onExitClicked()
        Mockito.verify(attachedActivity).finish()
    }
}