package io.smallant.imerir.library.ui.detail.viewholder

import android.view.View
import android.widget.TextView
import io.smallant.imerir.library.R
import io.smallant.imerir.library.base.BaseViewHolder
import io.smallant.imerir.library.data.models.Comment

class CommentViewHolder(view: View): BaseViewHolder<Comment>(view) {

    private val content: TextView by lazy { itemView.findViewById<TextView>(R.id.content) }

    override fun bind(item: Comment, position: Int) {
        content.text = item.content
    }
}