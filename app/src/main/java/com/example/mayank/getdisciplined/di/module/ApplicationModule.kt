package com.example.mayank.getdisciplined.di.module

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import com.example.mayank.getdisciplined.App
import com.example.mayank.getdisciplined.data.AppDataManager
import com.example.mayank.getdisciplined.data.DataManager
import com.example.mayank.getdisciplined.data.db.AppDatabase
import com.example.mayank.getdisciplined.data.prefs.AppPreferencesHelper
import com.example.mayank.getdisciplined.data.prefs.PreferencesHelper
import com.example.mayank.getdisciplined.di.ApplicationContext
import com.example.mayank.getdisciplined.di.PreferenceInfo
import com.example.mayank.getdisciplined.utils.AppConstants
import com.example.mayank.getdisciplined.utils.rx.AppSchedulerProvider
import com.example.mayank.getdisciplined.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ApplicationModule(private val application: Application) {
    @Provides
    @ApplicationContext
    fun provideContext(): Context = application

    @Provides
    fun provideApplication(): Application = application

    @Provides
    @Singleton
    fun provideDataManager(appDataManager: AppDataManager): DataManager = appDataManager

    @Provides
    @PreferenceInfo
    fun providePreferenceName(): String = AppConstants.PREF_NAME

    @Provides
    @Singleton
    fun providePreferencesHelper(appPreferencesHelper: AppPreferencesHelper): PreferencesHelper = appPreferencesHelper

    @Provides
    fun provideAppDatabase(): AppDatabase = Room.databaseBuilder(application, AppDatabase::class.java, "we-need-db").build()

}