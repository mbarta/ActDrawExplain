package me.barta.actdrawexplain.di.inject

import android.content.Context
import dagger.Component
import me.barta.actdrawexplain.di.activity.ViewModelActivity
import me.barta.actdrawexplain.di.fragment.ViewModelFragment
import javax.inject.Singleton

/**
 * Created by milan on 5/3/17.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    @AppContext
    fun appContext(): Context

    fun inject(viewModelActivity: ViewModelActivity)
    fun inject(viewModelFragment: ViewModelFragment)
}