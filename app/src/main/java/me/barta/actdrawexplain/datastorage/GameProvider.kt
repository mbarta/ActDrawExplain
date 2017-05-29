package me.barta.actdrawexplain.datastorage

import android.content.Context

/**
 * Storage Manager class.
 * Takes care of storing game settings, status, etc.
 */

class GameProvider(val appContext : Context) {

    var gameSettings : GameSettings? = null
    // TODO: gameStatus

    fun createNewGame() {
        // TODO: backup previous game?
        // TODO: resume unfinished game?
        // TODO: set the same settings as previous game?
        gameSettings = GameSettings()
    }

}