package me.barta.actdrawexplain.inject

import dagger.Component
import me.barta.actdrawexplain.inject.inject.ActivityComponent
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(TestModule::class))
interface TestComponent : ActivityComponent {
    fun inject(baseTest: BaseTest)
}