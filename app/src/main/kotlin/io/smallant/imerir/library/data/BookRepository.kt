package io.smallant.imerir.library.data

import io.smallant.imerir.library.data.models.Book
import io.smallant.imerir.library.data.sources.BookLocalDataSource
import io.smallant.imerir.library.data.sources.BookRemoteDataSource

class BookRepository(private val localDataSource: BookLocalDataSource, private val remoteDataSource: BookRemoteDataSource) {

    fun getBooks(): List<Book> {
        // Do some modifications on this list
        return localDataSource.books
    }

}