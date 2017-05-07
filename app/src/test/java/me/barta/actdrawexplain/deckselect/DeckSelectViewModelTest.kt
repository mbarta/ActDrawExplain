package me.barta.actdrawexplain.menu

import me.barta.actdrawexplain.inject.BaseTest
import org.junit.Test
import org.mockito.Mockito

/**
 * Tests for the View model for the main menu screen.
 */

class DeckSelectViewModelTest : BaseTest() {

    lateinit var viewModel: DeckSelectViewModel

    override fun setup() {
        super.setup()
        viewModel = DeckSelectViewModel(testComponent)
    }

    @Test
    fun onBackClicked_activityFinishes() {
        viewModel.onBackClicked()
        Mockito.verify(attachedActivity).finish()
    }

    @Test
    fun onNextClicked_activityFinishes() {
        viewModel.onNextClicked()
        // TODO: finish
    }

    @Test
    fun onSelectAllClicked_allDecksSelected() {
        viewModel.onSelectAllClicked()
        // TODO: finish
    }

    @Test
    fun onSelectNoneClicked_noDeckSelected() {
        viewModel.onSelectNoneClicked()
        // TODO: finish
    }

    @Test
    fun onLanguageSelectClicked_languageSelectionDialogIsDisplayed() {
        viewModel.onLanguageSelectClicked()
        // TODO: finish
    }
}