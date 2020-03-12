package io.smallant.imerir.library.ui.home.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.smallant.imerir.library.Constants
import io.smallant.imerir.library.R
import io.smallant.imerir.library.base.BaseViewHolder
import io.smallant.imerir.library.data.models.Section
import io.smallant.imerir.library.ui.home.OnSectionClickListener
import io.smallant.imerir.library.ui.home.recycleradapter.FeaturedBookRecyclerAdapter
import io.smallant.imerir.library.ui.home.recycleradapter.LatestedBookRecyclerAdapter

class SectionViewHolder(view: View, private val onSectionClickListener: OnSectionClickListener): BaseViewHolder<Section>(view) {

    private val label: TextView by lazy { view.findViewById<TextView>(R.id.label) }
    private val recycler: RecyclerView by lazy { view.findViewById<RecyclerView>(R.id.recycler) }

    override fun bind(item: Section, position: Int) {

        // TODO Part III
        val adapter = if (item.id == Constants.Section.FEATURED_ID)
            FeaturedBookRecyclerAdapter(onSectionClickListener)
        else
            LatestedBookRecyclerAdapter(onSectionClickListener)

        label.text = item.label
        recycler.adapter = adapter
        adapter.setItems(item.books)

        label.setOnClickListener {
            onSectionClickListener.onSectionClicked(item)
        }
    }

}