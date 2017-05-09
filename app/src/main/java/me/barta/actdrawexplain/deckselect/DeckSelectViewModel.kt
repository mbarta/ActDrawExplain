package me.barta.actdrawexplain.menu

import io.realm.Realm
import me.barta.actdrawexplain.common.inject.ActivityComponent
import me.barta.actdrawexplain.common.viewmodel.ViewModel
import me.barta.actdrawexplain.datamodel.database.Deck
import me.barta.actdrawexplain.datastorage.StorageManager
import me.barta.actdrawexplain.deckselect.DeckAdapter
import javax.inject.Inject

/**
 * View model for the deck select screen.
 */
class DeckSelectViewModel(activityComponent: ActivityComponent) : ViewModel(activityComponent) {

    @Inject
    lateinit var storageManager: StorageManager

    override fun inject() {
        activityComponent.inject(this)
    }

    fun getDeckAdapter(): DeckAdapter {
        val realm = Realm.getDefaultInstance()

//        realm.executeTransaction {
//            it.copyToRealm(Deck(2))
//        }

        val deckList = realm.where(Deck::class.java).findAll()

        return DeckAdapter(deckList, true, activityComponent)
    }

    fun onBackClicked() {
        attachedActivity.finish()
    }

    fun onNextClicked() {
        TODO("not implemented")
    }

    fun onSelectAllClicked() {
        TODO("not implemented")
    }

    fun onSelectNoneClicked() {
        TODO("not implemented")
    }

    fun onLanguageSelectClicked() {
        TODO("not implemented")
    }
}