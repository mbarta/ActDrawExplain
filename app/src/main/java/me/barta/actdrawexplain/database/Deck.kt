package me.barta.actdrawexplain.database

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Data class representing a Deck of cards.
 */

open class Deck(
        @PrimaryKey open var id : Long = 0,
        open var name : RealmList<Translation> = RealmList<Translation>(),
        open var imageUrl : String = "",
        open var content : DeckContent? = null,
        open var terms : RealmList<Term> = RealmList<Term>()
) : RealmObject()