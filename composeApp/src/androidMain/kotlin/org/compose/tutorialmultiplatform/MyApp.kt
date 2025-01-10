package org.compose.tutorialmultiplatform

import android.app.Application
import androidx.lifecycle.viewmodel.compose.viewModel
import org.compose.tutorialmultiplatform.viewmodels.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApp)
            modules(appModule)  // Including the app module for ViewModels and other dependencies
        }
    }
}
val appModule: Module = module {
    single { MainViewModel() }
}