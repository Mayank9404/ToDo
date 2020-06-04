package com.example.mayank.getdisciplined.ui.main.task.add

import com.example.mayank.getdisciplined.ui.base.MvpView


interface AddMvpView: MvpView {
    fun setFragment()

    fun clearEditText()

    fun addTaskAction()
}