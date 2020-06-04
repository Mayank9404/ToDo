package com.example.mayank.getdisciplined.data.db.helpers

import com.example.mayank.getdisciplined.data.db.model.Task
import io.reactivex.Flowable
import io.reactivex.Single

interface TaskHelper {

    fun addTaskList(listId: Long, task: String)

    fun addTaskToDoAndToday(dateId: Long?, task: String)

    fun getTasksByDayId(date: Long, status: Boolean): Single<List<Task>>

    fun getTasksToDo(status: Boolean): Single<List<Task>>

    fun getTasksByListId(id: Long, status: Boolean): Single<List<Task>>

    fun getAllTasks(): Flowable<List<Task>>

    fun updateTaskOrder(task: Task, order: Int)

    fun updateTaskStatus(task: Task)

    fun deleteTask(task: Task)
}