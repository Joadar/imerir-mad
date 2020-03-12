package io.smallant.imerir.library.data.sources

import io.smallant.imerir.library.data.sources.local.BookLocalDataSource
import io.smallant.imerir.library.data.sources.remote.BookRemoteDataSource

class BookRepository(private val localDataSource: BookLocalDataSource, private val remoteDataSource: BookRemoteDataSource) {

    suspend fun getBooks() = remoteDataSource.getBooks()

}