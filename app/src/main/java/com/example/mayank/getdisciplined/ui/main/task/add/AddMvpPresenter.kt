package com.example.mayank.getdisciplined.ui.main.task.add

import com.example.mayank.getdisciplined.ui.base.MvpPresenter


interface AddMvpPresenter<V: AddMvpView> : MvpPresenter<V> {
//    fun addTask(taskText: String, listId: Long?, operation: () -> Unit)
    fun addTaskToday(taskText: String, operation: () -> Unit)
    fun addTaskToDo(taskText: String, operation: () -> Unit)
    fun addTaskListId(taskText: String, listId: Long,  operation: () -> Unit)
}