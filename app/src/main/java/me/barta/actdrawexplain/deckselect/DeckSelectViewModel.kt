package me.barta.actdrawexplain.menu

import me.barta.actdrawexplain.common.inject.ActivityComponent
import me.barta.actdrawexplain.common.viewmodel.ViewModel
import me.barta.actdrawexplain.datastorage.StorageManager
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