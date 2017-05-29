package me.barta.actdrawexplain.common.inject

import android.content.Context
import dagger.Component
import me.barta.actdrawexplain.common.activity.ViewModelActivity
import me.barta.actdrawexplain.common.fragment.ViewModelFragment
import me.barta.actdrawexplain.datastorage.GameProvider
import me.barta.actdrawexplain.menu.MainMenuActivity
import javax.inject.Singleton

/**
 * AppComponent for injecting application context.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun appContext(): Context
    fun gameProvider() : GameProvider

    fun inject(viewModelActivity: ViewModelActivity)
    fun inject(viewModelActivity: MainMenuActivity)

    fun inject(viewModelFragment: ViewModelFragment)
}