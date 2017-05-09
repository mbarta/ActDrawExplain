package me.barta.actdrawexplain.common.databinding

import android.databinding.BindingAdapter
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import me.barta.actdrawexplain.deckselect.DeckAdapter

/**
 * Binding adapters for data binding.
 */

@BindingAdapter("bind:deckAdapter")
fun setDeckItems(recyclerView: RecyclerView, deckAdapter: DeckAdapter) {
    recyclerView.layoutManager = GridLayoutManager(recyclerView.context, 2)
    recyclerView.adapter = deckAdapter
}