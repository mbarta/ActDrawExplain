package me.barta.actdrawexplain.common.inject

import dagger.Component
import me.barta.actdrawexplain.common.viewmodel.ViewModel
import me.barta.actdrawexplain.menu.DeckSelectViewModel
import me.barta.actdrawexplain.menu.MainMenuViewModel

/**
 * Activity component for injection of Activities.
 */

@PerActivity
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(viewModel: ViewModel)
    fun inject(viewModel: MainMenuViewModel)
    fun inject(viewModel: DeckSelectViewModel)
}
