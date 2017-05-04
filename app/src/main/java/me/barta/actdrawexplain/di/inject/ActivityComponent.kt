package me.barta.actdrawexplain.di.inject

import dagger.Component
import me.barta.actdrawexplain.di.viewmodel.ViewModel
import me.barta.actdrawexplain.menu.MainMenuViewModel

/**
 * Created by milan on 5/3/17.
 */

@PerActivity
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(viewModel: ViewModel)
    fun inject(viewModel: MainMenuViewModel)
}
