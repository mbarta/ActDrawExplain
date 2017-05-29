package me.barta.actdrawexplain.deckselect

import io.realm.Realm
import me.barta.actdrawexplain.common.inject.ActivityComponent
import me.barta.actdrawexplain.common.viewmodel.ViewModel
import me.barta.actdrawexplain.database.Deck
import me.barta.actdrawexplain.datastorage.StorageManager
import timber.log.Timber
import javax.inject.Inject

/**
 * View model for the deck select screen.
 */
class DeckSelectViewModel(activityComponent: ActivityComponent) : ViewModel(activityComponent) {

    @Inject
    lateinit var storageManager: StorageManager

    var deckAdapter : DeckAdapter

    init {
        val realm = Realm.getDefaultInstance()
//        realm.executeTransaction {
//            it.copyToRealm(Deck(2))
//        }
        val deckList = realm.where(Deck::class.java).findAll()
        deckAdapter = DeckAdapter(deckList, true, activityComponent)
        deckAdapter.setHasStableIds(true)
    }

    override fun inject() {
        activityComponent.inject(this)
    }

    fun onBackClicked() {
        attachedActivity.finish()
    }

    fun onNextClicked() {
        Timber.d("Number of selected items: %d", deckAdapter.selectedDecks.count { it })
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
}