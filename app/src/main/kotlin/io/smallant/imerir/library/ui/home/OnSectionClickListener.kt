package io.smallant.imerir.library.ui.home

import io.smallant.imerir.library.data.models.Book
import io.smallant.imerir.library.data.models.Section

interface OnSectionClickListener {
    fun onBookClicked(book: Book)
    fun onSectionClicked(section: Section)
}