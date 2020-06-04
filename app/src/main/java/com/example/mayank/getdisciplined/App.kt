package com.example.mayank.getdisciplined

import android.app.Application
import android.arch.persistence.room.Room
import com.example.mayank.getdisciplined.data.DataManager
import com.example.mayank.getdisciplined.data.db.AppDatabase
import com.example.mayank.getdisciplined.di.component.ApplicationComponent
import com.example.mayank.getdisciplined.di.component.DaggerApplicationComponent
import com.example.mayank.getdisciplined.di.module.ApplicationModule
import javax.inject.Inject

class App : Application() {

    @Inject lateinit var dataManager: DataManager

     private val applicationComponent: ApplicationComponent by lazy {
         DaggerApplicationComponent
                 .builder()
                 .applicationModule(ApplicationModule(this))
                 .build()
     }

    override fun onCreate() {
        super.onCreate()

        applicationComponent.inject(this)
    }

    fun component() = applicationComponent
}