package io.alekseimartoyas.financetracker.di

import dagger.Component
import io.alekseimartoyas.financetracker.di.modules.DataSourceModule
import io.alekseimartoyas.financetracker.di.modules.ExchRateProviderModule
//import io.alekseimartoyas.financetracker.di.modules.FinanceCalculatingModule
import io.alekseimartoyas.financetracker.di.modules.SettingsModule
import io.alekseimartoyas.financetracker.services.DataSource
import io.alekseimartoyas.financetracker.services.ExchRateProvider
import io.alekseimartoyas.financetracker.services.SettingsSevice
import retrofit2.Retrofit

@Component(modules = [/*FinanceCalculatingModule::class,*/
    DataSourceModule::class,
    SettingsModule::class,
    ExchRateProviderModule::class])
interface ServicesEntityComponent {
    fun getDataSource(): DataSource
//    fun getFinanceCalculating(): FinanceCalculating
    fun getSettingsService(): SettingsSevice
    fun getExchRateProvider(): ExchRateProvider
}