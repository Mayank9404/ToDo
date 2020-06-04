package com.example.mayank.getdisciplined.ui.main.navigationItem

import com.example.mayank.getdisciplined.ui.base.DialogMvpView


interface ListIdNameDialogMvpView : DialogMvpView {
    fun updateIdListTitleToolbar()

    fun cancelCreatingListId()
}