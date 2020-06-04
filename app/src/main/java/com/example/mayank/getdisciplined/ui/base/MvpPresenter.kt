package com.example.mayank.getdisciplined.ui.base

import io.reactivex.Observable


interface MvpPresenter<V : MvpView> {
    fun onAttach(mvpView: V)

    fun onDetach()

}

