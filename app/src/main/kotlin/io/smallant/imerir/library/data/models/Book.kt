package io.smallant.imerir.library.data.models

// Part I
data class Book(
    val id: Int,
    val title: String,
    val price: Float,
    val cover: String,
    val note: Float,
    val description: String? = null
)