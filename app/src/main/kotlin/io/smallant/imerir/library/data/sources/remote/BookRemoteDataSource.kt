package io.smallant.imerir.library.data.sources.remote

import io.smallant.imerir.library.data.models.Book

// TODO Part VIII
class BookRemoteDataSource(private val bookApiService: BookApiService) {

    suspend fun getBooks(): List<Book> = bookApiService.listBooks()

}