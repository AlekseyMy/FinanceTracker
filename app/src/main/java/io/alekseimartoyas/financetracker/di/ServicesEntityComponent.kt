package io.alekseimartoyas.financetracker.di

import dagger.Component
import io.alekseimartoyas.financetracker.entity.FinanceCalculating
import io.alekseimartoyas.financetracker.services.DataSource
import io.alekseimartoyas.financetracker.services.SettingsSevice

@Component(modules = [FinanceCalculatingModule::class,
    DataSourceModule::class,
    SettingsModule::class])
interface ServicesEntityComponent {
    fun getDataSource(): DataSource
    fun getFinanceCalculating(): FinanceCalculating
    fun getSettingsService(): SettingsSevice
}