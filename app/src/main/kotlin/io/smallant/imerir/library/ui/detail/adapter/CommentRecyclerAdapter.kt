package io.smallant.imerir.library.ui.detail.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import io.smallant.imerir.library.R
import io.smallant.imerir.library.base.BaseRecyclerAdapter
import io.smallant.imerir.library.data.models.Comment
import io.smallant.imerir.library.ui.detail.viewholder.CommentViewHolder

class CommentRecyclerAdapter: BaseRecyclerAdapter<Comment, CommentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CommentViewHolder(layoutInflater.inflate(R.layout.item_comment, parent, false))
    }
}