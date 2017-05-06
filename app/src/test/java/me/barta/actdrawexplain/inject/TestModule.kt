package me.barta.actdrawexplain.inject

import android.content.Context
import dagger.Module
import dagger.Provides
import me.barta.actdrawexplain.inject.activity.AttachedActivity
import org.mockito.Mockito
import javax.inject.Singleton

@Module
class TestModule {

    @Provides
    @Singleton
    fun provideAppContext(): Context {
        return Mockito.mock(Context::class.java)
    }

    @Provides
    @Singleton
    fun provideAttachedActivity(): AttachedActivity {
        return Mockito.mock(AttachedActivity::class.java)
    }
}