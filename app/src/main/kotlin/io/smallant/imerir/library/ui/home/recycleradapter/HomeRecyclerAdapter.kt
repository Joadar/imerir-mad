package io.smallant.imerir.library.ui.home.recycleradapter

import android.view.LayoutInflater
import android.view.ViewGroup
import io.smallant.imerir.library.R
import io.smallant.imerir.library.base.BaseRecyclerAdapter
import io.smallant.imerir.library.base.BaseViewHolder
import io.smallant.imerir.library.data.models.Section
import io.smallant.imerir.library.ui.home.OnSectionClickListener
import io.smallant.imerir.library.ui.home.viewholder.SectionViewHolder

class HomeRecyclerAdapter(private val onSectionClickListener: OnSectionClickListener) : BaseRecyclerAdapter<Section, BaseViewHolder<Section>>() {

    companion object {
        private const val FEATURED_TYPE = 1
        // TODO Part III
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            FEATURED_TYPE -> SectionViewHolder(layoutInflater.inflate(R.layout.item_featured_section, parent, false), onSectionClickListener)
            // TODO Part III
            else -> SectionViewHolder(layoutInflater.inflate(R.layout.item_featured_section, parent, false), onSectionClickListener)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            // TODO Part III
            is Section -> FEATURED_TYPE
            else -> super.getItemViewType(position)
        }
    }
}