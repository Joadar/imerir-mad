package io.smallant.imerir.library.ui.home.recycleradapter

import android.view.LayoutInflater
import android.view.ViewGroup
import io.smallant.imerir.library.R
import io.smallant.imerir.library.base.BaseRecyclerAdapter
import io.smallant.imerir.library.base.BaseViewHolder
import io.smallant.imerir.library.data.models.Book
import io.smallant.imerir.library.ui.home.OnSectionClickListener
import io.smallant.imerir.library.ui.home.viewholder.BookViewHolder

// TODO Part III
class LatestedBookRecyclerAdapter(private val onItemClickListener: OnSectionClickListener): BaseRecyclerAdapter<Book, BaseViewHolder<Book>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Book> {
        val layoutInflater = LayoutInflater.from(parent.context)
        return BookViewHolder(layoutInflater.inflate(R.layout.item_lasted_book, parent, false))
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Book>, position: Int) {
        super.onBindViewHolder(holder, position)
        holder.itemView.setOnClickListener {
            onItemClickListener.onBookClicked(items[position])
        }
    }
}