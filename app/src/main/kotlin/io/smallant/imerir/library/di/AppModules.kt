package io.smallant.imerir.library.di

import io.smallant.imerir.library.Constants
import io.smallant.imerir.library.data.sources.BookRepository
import io.smallant.imerir.library.data.sources.local.BookLocalDataSource
import io.smallant.imerir.library.data.sources.remote.BookApiService
import io.smallant.imerir.library.data.sources.remote.BookRemoteDataSource
import io.smallant.imerir.library.ui.home.HomeViewModel
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private val dataModule = module {
    // TODO Part VII
    single { BookLocalDataSource() }
    single { BookRemoteDataSource(get()) }
    single { BookRepository(get(), get()) }
}

private val viewModelModule = module {
    // TODO Part X
    viewModel { HomeViewModel(get()) }
}

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .baseUrl(Constants.API_ENDPOINT)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create()).build()
}

fun provideOkHttpClient(): OkHttpClient {
    return OkHttpClient().newBuilder().build()
}

fun provideBookApi(retrofit: Retrofit): BookApiService = retrofit.create(BookApiService::class.java)

val networkModule = module {
    factory { provideOkHttpClient() }
    single { provideRetrofit(get()) }
    factory { provideBookApi(get()) }
}

val moduleList = listOf(
    viewModelModule,
    dataModule,
    networkModule
)