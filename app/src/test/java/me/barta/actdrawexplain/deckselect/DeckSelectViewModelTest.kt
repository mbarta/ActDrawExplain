package me.barta.actdrawexplain.menu

import me.barta.actdrawexplain.common.BaseTest
import me.barta.actdrawexplain.database.Deck
import me.barta.actdrawexplain.deckselect.DeckAdapter
import me.barta.actdrawexplain.deckselect.DeckSelectViewModel
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.times

/**
 * Tests for the View model for the main menu screen.
 */

class DeckSelectViewModelTest : BaseTest() {

    lateinit var viewModel: DeckSelectViewModel
    val deckAdapter: DeckAdapter = Mockito.mock(DeckAdapter::class.java)

    override fun setup() {
        super.setup()

        Mockito.doReturn(emptyList<Deck>()).`when`(realmDatabase).loadAllDecks()
        viewModel = DeckSelectViewModel(testComponent, deckAdapter)
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
        Mockito.verify(deckAdapter, times(1).description("Adapter's selectAllDecks should've been called")).selectAllDecks()
    }

    @Test
    fun onSelectNoneClicked_noDeckSelected() {
        viewModel.onSelectNoneClicked()
        Mockito.verify(deckAdapter, times(1).description("Adapter's deselectAllDecks should've been called")).deselectAllDecks()
    }

    @Test
    fun onLanguageSelectClicked_languageSelectionDialogIsDisplayed() {
        viewModel.onLanguageSelectClicked()
        // TODO: finish
    }
}