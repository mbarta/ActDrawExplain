package me.barta.actdrawexplain.common.inject

import dagger.Module
import dagger.Provides
import me.barta.actdrawexplain.common.activity.AttachedActivity
import me.barta.actdrawexplain.common.activity.AttachedViewModelActivity
import me.barta.actdrawexplain.common.activity.ViewModelActivity

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
