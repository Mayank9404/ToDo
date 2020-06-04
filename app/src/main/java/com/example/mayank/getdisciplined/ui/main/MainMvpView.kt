package com.example.mayank.getdisciplined.ui.main

import android.support.v4.app.Fragment
import com.example.mayank.getdisciplined.data.db.model.ListId
import com.example.mayank.getdisciplined.ui.base.MvpView


interface MainMvpView : MvpView {
    fun setTaskFragment(fragment: Fragment)

    fun openDrawer()

    fun closeDrawer()

    fun updateNavigationArray(array: ArrayList<ListId>)

    fun showListIdNameDialog(listId: ListId)

}