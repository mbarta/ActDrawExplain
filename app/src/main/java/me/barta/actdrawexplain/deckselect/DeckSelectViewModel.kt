package me.barta.actdrawexplain.deckselect

import me.barta.actdrawexplain.common.inject.ActivityComponent
import me.barta.actdrawexplain.common.viewmodel.ViewModel
import me.barta.actdrawexplain.database.realm.RealmDatabase
import me.barta.actdrawexplain.datastorage.GameProvider
import me.barta.actdrawexplain.datastorage.GameSettings
import javax.inject.Inject

/**
 * View model for the deck select screen.
 */
class DeckSelectViewModel(activityComponent: ActivityComponent, val deckAdapter: DeckAdapter) : ViewModel(activityComponent) {

    @Inject
    lateinit var gameProvider: GameProvider

    @Inject
    lateinit var realmDB: RealmDatabase

    init {
        deckAdapter.data = realmDB.loadAllDecks()
    }

    override fun inject() {
        activityComponent.inject(this)
    }

    fun onBackClicked() {
        attachedActivity.finish()
    }

    fun onNextClicked() {
        gameProvider.gameSettings?.let { storeSelectedDeckIds(it) }
        // TODO: move to next screen
    }

    fun onSelectAllClicked() {
        deckAdapter.selectAllDecks()
    }

    fun onSelectNoneClicked() {
        deckAdapter.deselectAllDecks()
    }

    fun onLanguageSelectClicked() {
        TODO("not implemented")
    }

    private fun storeSelectedDeckIds(gameSettings: GameSettings) {
        gameSettings.deckIds = deckAdapter.getSelectedDeckIds()
    }
}