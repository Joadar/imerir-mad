package io.smallant.imerir.library.base

import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerAdapter<T: Any, VH: BaseViewHolder<T>> : RecyclerView.Adapter<VH>() {

    val items: ArrayList<T> = arrayListOf()

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = items[position]
        with(holder) {
            bind(item, position)
        }
    }

    open fun setItems(list: List<T>?, clearList: Boolean = false) {
        items.clear()
        list?.let { newItems ->
            items.addAll(newItems)
        }
        notifyDataSetChanged()
    }
}