package me.barta.actdrawexplain.common

import android.content.Context
import android.support.annotation.CallSuper
import me.barta.actdrawexplain.common.activity.AttachedActivity
import org.junit.Assert
import org.junit.Before
import org.mockito.Mockito
import javax.inject.Inject

open class BaseTest : Assert() {

    val testComponent: TestComponent = DaggerTestComponent.builder()
            .testModule(TestModule())
            .build()

    @Inject
    lateinit var appContext: Context

    @Inject
    lateinit var attachedActivity: AttachedActivity

    init {
        inject()
    }

    fun inject() {
        testComponent.inject(this)
    }

    @CallSuper
    @Before
    open fun setup() {
        Mockito.reset<Any>(appContext, attachedActivity)
    }
}