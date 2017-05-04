package me.barta.actdrawexplain.di.inject

import dagger.Module
import dagger.Provides
import me.barta.actdrawexplain.di.activity.AttachedActivity
import me.barta.actdrawexplain.di.activity.AttachedViewModelActivity
import me.barta.actdrawexplain.di.activity.ViewModelActivity

/**
 * Created by milan on 5/3/17.
 */

@Module
class ActivityModule(private val activity: ViewModelActivity) {

    @Provides
    @PerActivity
    fun provideAttachedActivity(): AttachedActivity {
        return AttachedViewModelActivity(activity)
    }
}
