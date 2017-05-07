package me.barta.actdrawexplain.common

import dagger.Component
import me.barta.actdrawexplain.common.inject.ActivityComponent
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(TestModule::class))
interface TestComponent : ActivityComponent {
    fun inject(baseTest: BaseTest)
}