package io.smallant.imerir.library.data.models

data class Section(
    val id: Int,
    val label: String,
    val books: List<Book>
)