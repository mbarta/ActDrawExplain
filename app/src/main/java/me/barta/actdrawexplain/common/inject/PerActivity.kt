package me.barta.actdrawexplain.common.inject

import javax.inject.Scope

/**
 * Activity lifecycle scope.
 */

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity
