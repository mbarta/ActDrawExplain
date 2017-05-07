package me.barta.actdrawexplain.datamodel.database

import io.realm.RealmObject

/**
 * Data class representing the stats for Deck content.
 */

open class DeckContent(
        open var act : Int = 0,
        open var draw : Int = 0,
        open var explain : Int = 0
) : RealmObject()