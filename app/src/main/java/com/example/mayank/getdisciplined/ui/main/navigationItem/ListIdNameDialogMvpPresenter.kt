package com.example.mayank.getdisciplined.ui.main.navigationItem

import com.example.mayank.getdisciplined.data.db.model.ListId
import com.example.mayank.getdisciplined.ui.base.MvpPresenter


interface ListIdNameDialogMvpPresenter<V : ListIdNameDialogMvpView> : MvpPresenter<V> {
    fun updateListId(listId: ListId)

    fun cancelListId(listId: ListId)
}