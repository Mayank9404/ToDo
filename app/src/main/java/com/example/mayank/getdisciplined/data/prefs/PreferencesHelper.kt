package com.example.mayank.getdisciplined.data.prefs


interface PreferencesHelper {
    fun setFinishedTasksVisibility(status: Boolean)

    fun getFinishedTasksVisibility(): Boolean
}