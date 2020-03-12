package io.smallant.imerir.library.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Comment(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val bookId: Int,
    val content: String
)