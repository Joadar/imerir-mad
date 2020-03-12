package io.smallant.imerir.library.di

import io.smallant.imerir.library.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val viewModelModule = module {
    viewModel { HomeViewModel() }
}

val moduleList = listOf(
    viewModelModule
)