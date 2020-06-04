package com.example.mayank.getdisciplined.ui.main.task.base

import com.example.mayank.getdisciplined.ui.base.MvpPresenter


interface BaseTaskMvpPresenter<V: BaseTaskMvpView> : MvpPresenter<V> {
    fun isTodayExist()

    fun getTasks(dateId: Long)

    fun getTasksVisibility()

    fun changeTaskVisibility()
}