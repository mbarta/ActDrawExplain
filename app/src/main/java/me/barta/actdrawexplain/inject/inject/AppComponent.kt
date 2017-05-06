package me.barta.actdrawexplain.inject.inject

import android.content.Context
import dagger.Component
import me.barta.actdrawexplain.inject.activity.ViewModelActivity
import me.barta.actdrawexplain.inject.fragment.ViewModelFragment
import me.barta.actdrawexplain.menu.MainMenuActivity
import javax.inject.Singleton

/**
 * AppComponent for injecting application context.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun appContext(): Context

    fun inject(viewModelActivity: ViewModelActivity)
    fun inject(viewModelActivity: MainMenuActivity)

    fun inject(viewModelFragment: ViewModelFragment)
}