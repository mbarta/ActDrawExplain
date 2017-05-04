package me.barta.actdrawexplain.di.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import me.barta.actdrawexplain.ActDrawExplainApp
import me.barta.actdrawexplain.di.inject.ActivityComponent
import me.barta.actdrawexplain.di.inject.ActivityModule
import me.barta.actdrawexplain.di.inject.DaggerActivityComponent
import me.barta.actdrawexplain.di.viewmodel.ViewModel

/**
 * Created by milan on 5/3/17.
 */

open class ViewModelActivity : AppCompatActivity() {

    lateinit var activityComponent : ActivityComponent
    lateinit var viewModel : ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appComponent = (application as ActDrawExplainApp).appComponent
        appComponent.inject(this)

        activityComponent = DaggerActivityComponent.builder()
                .appComponent(appComponent)
                .activityModule(ActivityModule(this))
                .build()

        viewModel = createViewModel()!!
    }

    open fun createViewModel(): ViewModel? {
        return null
    }
}
