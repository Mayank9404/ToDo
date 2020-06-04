package com.example.mayank.getdisciplined.data.db.helpers

import com.example.mayank.getdisciplined.data.db.model.ListId
import io.reactivex.Flowable
import io.reactivex.Single


interface ListIdHelper {
    fun addListId()

    fun getLastId() : Single<ListId>

    fun getAllListId(): Flowable<List<ListId>>

    fun updateListId(listId: ListId)

    fun deleteListId(listId: ListId)

    fun getListIdName(id: Long): Single<String>
}