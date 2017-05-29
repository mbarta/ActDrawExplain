package me.barta.actdrawexplain.database.realm

import io.realm.Realm
import me.barta.actdrawexplain.database.Deck

/**
 * Wrapper around Realm database (takes care of closing Realm instances).
 * Only returns unmanaged (detached) objects.
 *
 * // TODO: tests
 */

class RealmDatabase {

    fun loadAllDecks() : List<Deck> {
        var listOfDecks: List<Deck> = emptyList()
        Realm.getDefaultInstance().use { realm ->
            val list = realm.where(Deck::class.java).findAll()
            listOfDecks = realm?.copyFromRealm(list)!!
        }

        return listOfDecks
    }
}
