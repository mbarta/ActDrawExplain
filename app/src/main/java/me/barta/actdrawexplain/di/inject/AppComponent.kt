package me.barta.actdrawexplain.di.inject

import android.content.Context
import dagger.Component
import me.barta.actdrawexplain.di.activity.ViewModelActivity
import me.barta.actdrawexplain.di.fragment.ViewModelFragment
import me.barta.actdrawexplain.menu.MainMenuActivity
import javax.inject.Singleton

/**
 * Created by milan on 5/3/17.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun appContext(): Context

    fun inject(viewModelActivity: ViewModelActivity)
    fun inject(viewModelActivity: MainMenuActivity)

    fun inject(viewModelFragment: ViewModelFragment)
}