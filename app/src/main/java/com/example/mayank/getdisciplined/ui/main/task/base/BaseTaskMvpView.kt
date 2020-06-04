package com.example.mayank.getdisciplined.ui.main.task.base

import com.example.mayank.getdisciplined.data.db.model.Task
import com.example.mayank.getdisciplined.ui.base.MvpView


interface BaseTaskMvpView : MvpView {
    fun showAddTaskView()

    fun hideAddTaskView()

    fun updateTasksList(array: ArrayList<Task>)

    fun setToolbar(title: String)

    fun <V: BaseTaskMvpView> setFragment(presenter: BaseTaskPresenter<V>)

    fun updateTasksVisibilityIcon(visibility: Boolean)
}