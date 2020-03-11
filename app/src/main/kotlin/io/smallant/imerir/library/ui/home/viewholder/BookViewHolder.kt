package io.smallant.imerir.library.ui.home.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import io.smallant.imerir.library.R
import io.smallant.imerir.library.base.BaseViewHolder
import io.smallant.imerir.library.data.models.Book

class BookViewHolder(view: View): BaseViewHolder<Book>(view) {

    private val title: TextView by lazy { view.findViewById<TextView>(R.id.title) }
    private val cover: ImageView by lazy { view.findViewById<ImageView>(R.id.cover) }
    private val note: TextView? by lazy { view.findViewById<TextView>(R.id.note) }
    private val price: TextView by lazy { view.findViewById<TextView>(R.id.price) }
    private val description: TextView? by lazy { view.findViewById<TextView>(R.id.description) }

    override fun bind(item: Book, position: Int) {
        title.text = item.title
        note?.text = item.note.toString()
        price.text = itemView.context.getString(R.string.book_price, item.price)
        description?.text = item.description
    }

}