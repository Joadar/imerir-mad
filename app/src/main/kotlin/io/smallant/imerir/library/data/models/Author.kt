package io.smallant.imerir.library.data.models

import java.text.SimpleDateFormat
import java.util.*

data class Author(
    val id: Int,
    val firstname: String,
    val lastname: String,
    val dateOfBirth: Date
) {
    override fun toString(): String {
        val dateFormat = SimpleDateFormat("dd/MM/YYYY", Locale.getDefault()).format(dateOfBirth)
        return "$firstname $lastname was born on $dateFormat"
    }
}