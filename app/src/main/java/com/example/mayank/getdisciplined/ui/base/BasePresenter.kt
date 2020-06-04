package com.example.mayank.getdisciplined.ui.base

import com.example.mayank.getdisciplined.data.DataManager
import com.example.mayank.getdisciplined.utils.rx.SchedulerProvider
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject


open class BasePresenter<V : MvpView> @Inject
constructor(var dataManager: DataManager,
            var schedulerProvider: SchedulerProvider?,
            var compositeDisposable: CompositeDisposable?) : MvpPresenter<V> {

    var mvpView: V? = null

    override fun onAttach(mvpView: V) {
        this.mvpView = mvpView
    }

    override fun onDetach() {
        compositeDisposable?.dispose()
        mvpView = null
    }
}