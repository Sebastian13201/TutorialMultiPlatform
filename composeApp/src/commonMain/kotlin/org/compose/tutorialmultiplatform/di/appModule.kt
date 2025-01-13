package org.compose.tutorialmultiplatform.di

import org.compose.tutorialmultiplatform.data.api.ApiClient
import org.compose.tutorialmultiplatform.data.api.createHttpClient
import org.compose.tutorialmultiplatform.viewmodels.MainViewModel
import org.koin.dsl.module

val appModule = module {
    single { ApiClient(get()) }
    single { MainViewModel(get()) }
}