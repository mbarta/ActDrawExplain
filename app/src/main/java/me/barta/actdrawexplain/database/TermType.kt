package me.barta.actdrawexplain.database

import io.realm.RealmObject

/**
 * Data class representing the type and difficulty of a term.
 */

enum class TermTypeId(val id : Int) {
    ACT(0),
    DRAW(1),
    EXPLAIN(2);

    companion object {
        private val map = TermTypeId.values().associateBy(TermTypeId::id)

        fun fromInt(type: Int) = map[type]
    }
}

open class TermType(
        open var idVal : Int = 0,
        open var difficulty : Int = 0
) : RealmObject() {

    var id : TermTypeId?
        get() = TermTypeId.fromInt(idVal)
        set(value) = assignIdValue(value)

    private fun assignIdValue(id: TermTypeId?) {
        id?.let {
            idVal = it.id
        }
    }
}