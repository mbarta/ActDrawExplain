package me.barta.actdrawexplain.inject.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View

import me.barta.actdrawexplain.ActDrawExplainApp
import me.barta.actdrawexplain.inject.activity.ViewModelActivity
import me.barta.actdrawexplain.inject.inject.ActivityComponent
import me.barta.actdrawexplain.inject.viewmodel.ViewModel

/**
 * Base Fragment implementation.
 * Takes care of setting up dependency injection.
 */

abstract class ViewModelFragment : Fragment() {
    private var viewModel: ViewModel? = null

    protected abstract fun createAndBindViewModel(root: View?, activityComponent: ActivityComponent?): ViewModel?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val appComponent = (activity.application as ActDrawExplainApp).appComponent
        appComponent.inject(this)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = createAndBindViewModel(view, (activity as ViewModelActivity).activityComponent)
    }
}
