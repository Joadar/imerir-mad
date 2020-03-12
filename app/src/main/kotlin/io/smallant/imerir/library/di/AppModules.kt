package io.smallant.imerir.library.di

import io.smallant.imerir.library.data.BookRepository
import io.smallant.imerir.library.data.sources.BookLocalDataSource
import io.smallant.imerir.library.data.sources.BookRemoteDataSource
import io.smallant.imerir.library.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val dataModule = module {
    // TODO Part VII
    single { BookLocalDataSource() }
    single { BookRemoteDataSource() }
    single { BookRepository(get(), get()) }
}

private val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
}

val moduleList = listOf(
    viewModelModule,
    dataModule
)