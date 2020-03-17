package io.smallant.imerir.library.ui.home.recycleradapter

import android.view.LayoutInflater
import android.view.ViewGroup
import io.smallant.imerir.base.BaseRecyclerAdapter
import io.smallant.imerir.base.BaseViewHolder
import io.smallant.imerir.library.Constants
import io.smallant.imerir.library.R
import io.smallant.imerir.library.data.models.Section
import io.smallant.imerir.library.ui.home.OnSectionClickListener
import io.smallant.imerir.library.ui.home.viewholder.SectionViewHolder

class HomeRecyclerAdapter(private val onSectionClickListener: OnSectionClickListener) : BaseRecyclerAdapter<Section, BaseViewHolder<Section>>() {

    companion object {
        private const val FEATURED_TYPE = 1
        private const val LATESTED_TYPE = 2
        // TODO Part III
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            FEATURED_TYPE -> SectionViewHolder(layoutInflater.inflate(R.layout.item_featured_section, parent, false), onSectionClickListener)
            // TODO Part III
            else -> SectionViewHolder(layoutInflater.inflate(R.layout.item_lasted_section, parent, false), onSectionClickListener)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (val item = items[position]) {
            // TODO Part III
            is Section -> if (item.id == Constants.Section.FEATURED_ID)
                FEATURED_TYPE
            else
                LATESTED_TYPE
            else -> super.getItemViewType(position)
        }
    }
}