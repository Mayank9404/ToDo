package com.example.mayank.getdisciplined.ui.main

import com.example.mayank.getdisciplined.di.PerActivity
import com.example.mayank.getdisciplined.ui.base.MvpPresenter


@PerActivity
interface MainMvpPresenter<V : MainMvpView> : MvpPresenter<V> {
    fun onDrawerClick()

    fun onAddListId()

    fun navigationListIds()


}