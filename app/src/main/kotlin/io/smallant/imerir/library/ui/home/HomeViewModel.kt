package io.smallant.imerir.library.ui.home

import androidx.lifecycle.ViewModel
import io.smallant.imerir.library.Constants
import io.smallant.imerir.library.data.BookRepository
import io.smallant.imerir.library.data.models.Section

class HomeViewModel(bookRepository: BookRepository): ViewModel() {

    val sections = arrayListOf(
        Section(Constants.Section.FEATURED_ID, "Featured", bookRepository.getBooks()),
        Section(Constants.Section.LATESTED_ID, "Latested", bookRepository.getBooks())
    )

}