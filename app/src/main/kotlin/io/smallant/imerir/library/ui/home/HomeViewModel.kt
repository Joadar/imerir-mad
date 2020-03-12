package io.smallant.imerir.library.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import io.smallant.imerir.library.data.models.Book
import io.smallant.imerir.library.data.sources.BookRepository
import kotlinx.coroutines.Dispatchers

class HomeViewModel(bookRepository: BookRepository): ViewModel() {

    val books: LiveData<List<Book>> = liveData(Dispatchers.IO) {
//        val retrievedData = bookRepository.getBooks()
//        emit(retrievedData)
    }

}