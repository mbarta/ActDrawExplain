package me.barta.actdrawexplain.deckselect

import me.barta.actdrawexplain.common.inject.ActivityComponent
import me.barta.actdrawexplain.common.viewmodel.ViewModel
import me.barta.actdrawexplain.database.Deck
import me.barta.actdrawexplain.database.realm.RealmDatabase
import me.barta.actdrawexplain.datastorage.GameProvider
import me.barta.actdrawexplain.datastorage.GameSettings
import javax.inject.Inject

/**
 * View model for the deck select screen.
 */
class DeckSelectViewModel(activityComponent: ActivityComponent) : ViewModel(activityComponent) {

    @Inject
    lateinit var gameProvider: GameProvider

    var deckAdapter : DeckAdapter

    init {
        val realmDB = RealmDatabase()
        val deckList : List<Deck> = realmDB.loadAllDecks()
        deckAdapter = DeckAdapter(deckList, activityComponent)
        deckAdapter.setHasStableIds(true)
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
        deckAdapter.selectedDecks.fill(true)
        deckAdapter.notifyDataSetChanged()
    }

    fun onSelectNoneClicked() {
        deckAdapter.selectedDecks.fill(false)
        deckAdapter.notifyDataSetChanged()
    }

    fun onLanguageSelectClicked() {
        TODO("not implemented")
    }

    private fun storeSelectedDeckIds(gameSettings: GameSettings) {
        gameSettings.deckIds = deckAdapter.selectedDecks
                .filter { it }
                .mapIndexedNotNull { index, _ -> deckAdapter.getItem(index)?.id }
    }
}