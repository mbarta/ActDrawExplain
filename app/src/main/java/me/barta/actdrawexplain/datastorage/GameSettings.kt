package me.barta.actdrawexplain.datastorage

import android.graphics.Color

/**
 * Storage for game settings.
 * Allows to save and later restore previous game settings.
 */

data class Team(
        var name : String = "",
        var color : Int = Color.WHITE,
        var members : List<String> = emptyList()
)

enum class GameType {
    POINTS,
    WINS
}

data class GameSettings(
        var languages : List<String> = emptyList(),
        var deckIds : List<Long> = emptyList(),
        var teams : List<Team> = emptyList(),
        var gameType : GameType = GameType.POINTS,
        var totalTimeMin : Int = 60,
        var totalPoints : Int = 0 // 0 means unlimited
)