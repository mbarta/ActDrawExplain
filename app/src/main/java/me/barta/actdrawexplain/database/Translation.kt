package me.barta.actdrawexplain.datamodel.database

import io.realm.RealmObject

/**
 * Data class representing a String in a specific language.
 */

open class Translation(
        open var lang : String = "",
        open var value : String = ""
) : RealmObject()