package me.barta.actdrawexplain.datamodel.database

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Data class representing a single term for ActDrawExplain.
 */

open class Term(
        @PrimaryKey open var id : Long = 0,
        open var types : RealmList<TermType> = RealmList<TermType>(),
        open var translations : RealmList<Translation> = RealmList<Translation>()
) : RealmObject()