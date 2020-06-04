package com.example.mayank.getdisciplined.ui.main.task.list

import com.example.mayank.getdisciplined.data.db.model.ListId
import com.example.mayank.getdisciplined.ui.main.task.base.BaseTaskMvpPresenter

interface ListMvpPresenter<V : ListMvpView> : BaseTaskMvpPresenter<V> {
    fun getListIdTitle(id: Long)

    fun getTasksByListId(id: Long)

    fun deleteList(listId: ListId)
}