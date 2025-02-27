package org.example.project.di

import com.russhwolf.settings.Settings
import org.example.project.data.local.PreferencesImpl
import org.example.project.data.remote.api.CurrencyApiServiceImpl
import org.example.project.domain.CurrencyApiService
import org.example.project.domain.PreferencesRepository
import org.example.project.presentation.screen.HomeViewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

val appModule= module {
    single{ Settings() }
    single<PreferencesRepository>{PreferencesImpl(settings=get())}
    single<CurrencyApiService>{CurrencyApiServiceImpl(preferences = get())}
    //factory used to inject the dependencies inside the view model
    factory {
        HomeViewModel(
            preferences = get(),
            api = get()
        )
    }
}
fun initializeKoin(){
    startKoin{
        modules(appModule)
    }
}