package io.smallant.imerir.library.data.sources.remote

import io.smallant.imerir.library.data.models.Book
import retrofit2.http.GET

interface BookApiService {

    @GET("/books")
    suspend fun listBooks(): List<Book>
}