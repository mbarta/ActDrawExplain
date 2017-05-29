package me.barta.actdrawexplain.deckselect

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import me.barta.actdrawexplain.R
import me.barta.actdrawexplain.common.inject.ActivityComponent
import me.barta.actdrawexplain.database.Deck
import me.barta.actdrawexplain.databinding.ItemDeckBinding


/**
 * RecyclerView Adapter for displaying Decks
 */

class DeckAdapter(val data: List<Deck>, val activityComponent: ActivityComponent) : RecyclerView.Adapter<DeckViewHolder>() {

    var selectedDecks : BooleanArray = BooleanArray(data.size) { false }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): DeckViewHolder {
        val layoutInflater : LayoutInflater = LayoutInflater.from(parent?.context)
        val deckBinding : ItemDeckBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_deck, parent, false)
        return DeckViewHolder(deckBinding)
    }

    override fun onBindViewHolder(holder: DeckViewHolder?, position: Int) {
        getItem(position)?.let {
            holder?.bind(DeckViewModel(activityComponent, it, this, selectedDecks[position]))
        }
    }

    fun getItem(position: Int) : Deck? = data.getOrNull(position)

    override fun getItemCount(): Int = data.size

    override fun getItemId(index: Int): Long = getItem(index)?.id ?: -1

    fun onCheckChanged(deck: Deck, checked: Boolean) {
        val idx = data.indexOf(deck)
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