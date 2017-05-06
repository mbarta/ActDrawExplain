package me.barta.actdrawexplain.inject.inject

import dagger.Module
import dagger.Provides
import me.barta.actdrawexplain.inject.activity.AttachedActivity
import me.barta.actdrawexplain.inject.activity.AttachedViewModelActivity
import me.barta.actdrawexplain.inject.activity.ViewModelActivity

/**
 * Activity module provides AttachedActivity objects for dependency injection.
 */

@Module
class ActivityModule(private val activity: ViewModelActivity) {

    @Provides
    @PerActivity
    fun provideAttachedActivity(): AttachedActivity {
        return AttachedViewModelActivity(activity)
    }
}
