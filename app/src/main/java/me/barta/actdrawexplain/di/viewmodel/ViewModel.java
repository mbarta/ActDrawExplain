package me.barta.actdrawexplain.di.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;

import javax.inject.Inject;

import me.barta.actdrawexplain.di.activity.AttachedActivity;
import me.barta.actdrawexplain.di.inject.ActivityComponent;
import me.barta.actdrawexplain.di.inject.AppContext;

/**
 * Created by milan on 5/4/17.
 *
 * Unfortunately, dependency injection doesn't work when this class is converted to Kotlin.
 * TODO: Try to find out why and fix it!
 */

public class ViewModel extends BaseObservable {

    @Inject
    @AppContext
    protected Context appContext;

    @Inject
    protected AttachedActivity attachedActivity;

    public ViewModel(ActivityComponent activityComponent) {
        activityComponent.inject(this);
    }
}
