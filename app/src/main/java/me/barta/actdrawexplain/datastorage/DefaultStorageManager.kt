package me.barta.actdrawexplain.datastorage

import android.content.Context

/**
 * Storage Manager class.
 * Takes care of storing game settings, status, etc.
 */

class DefaultStorageManager(val appContext : Context) : StorageManager {

    var gameSettings : GameSettings? = null

}