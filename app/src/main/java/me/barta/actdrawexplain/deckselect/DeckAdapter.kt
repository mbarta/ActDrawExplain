package me.barta.actdrawexplain.deckselect

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.realm.OrderedRealmCollection
import io.realm.RealmRecyclerViewAdapter
import me.barta.actdrawexplain.R
import me.barta.actdrawexplain.common.inject.ActivityComponent
import me.barta.actdrawexplain.databinding.ItemDeckBinding
import me.barta.actdrawexplain.datamodel.database.Deck


/**
 * RecyclerView Adapter for displaying Decks
 */

class DeckAdapter(data: OrderedRealmCollection<Deck>?, autoUpdate: Boolean, val activityComponent: ActivityComponent) :
        RealmRecyclerViewAdapter<Deck, DeckViewHolder>(data, autoUpdate) {

    override fun onBindViewHolder(holder: DeckViewHolder?, position: Int) {
        getItem(position)?.let {
            holder?.bind(DeckViewModel(activityComponent, it))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): DeckViewHolder {
        val layoutInflater : LayoutInflater = LayoutInflater.from(parent?.context)
        val deckBinding : ItemDeckBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_deck, parent, false)
        return DeckViewHolder(deckBinding)
    }

}

class DeckViewHolder(private val binding: ItemDeckBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(viewModel: DeckViewModel) {
        binding.viewModel = viewModel
        binding.executePendingBindings()
    }
}