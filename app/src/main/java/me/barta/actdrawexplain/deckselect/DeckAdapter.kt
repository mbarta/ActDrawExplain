package me.barta.actdrawexplain.deckselect

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.realm.OrderedRealmCollection
import io.realm.RealmRecyclerViewAdapter
import me.barta.actdrawexplain.R
import me.barta.actdrawexplain.common.inject.ActivityComponent
import me.barta.actdrawexplain.database.Deck
import me.barta.actdrawexplain.databinding.ItemDeckBinding


/**
 * RecyclerView Adapter for displaying Decks
 */

class DeckAdapter(data: OrderedRealmCollection<Deck>?, autoUpdate: Boolean, val activityComponent: ActivityComponent) :
        RealmRecyclerViewAdapter<Deck, DeckViewHolder>(data, autoUpdate) {

    var selectedDecks : BooleanArray = BooleanArray(data?.size ?: 0) { false }

    override fun onBindViewHolder(holder: DeckViewHolder?, position: Int) {
        getItem(position)?.let {
            holder?.bind(DeckViewModel(activityComponent, it, this, selectedDecks[position]))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): DeckViewHolder {
        val layoutInflater : LayoutInflater = LayoutInflater.from(parent?.context)
        val deckBinding : ItemDeckBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_deck, parent, false)
        return DeckViewHolder(deckBinding)
    }

    override fun getItemId(index: Int): Long {
        return getItem(index)?.id ?: -1
    }

    fun onCheckChanged(deck: Deck, checked: Boolean) {
        val idx = data?.indexOf(deck) ?: -1
        if (idx in 0..selectedDecks.size-1) {
            selectedDecks[idx] = checked
        }
    }
}

class DeckViewHolder(private val binding: ItemDeckBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(deckViewModel: DeckViewModel) {
        binding.viewModel = deckViewModel
        binding.executePendingBindings()
    }
}