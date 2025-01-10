package org.compose.tutorialmultiplatform

import org.compose.tutorialmultiplatform.viewmodels.MainViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule: Module = module {
    single { MainViewModel() }
}