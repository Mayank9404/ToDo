package com.example.mayank.getdisciplined.ui.splash

import com.example.mayank.getdisciplined.data.DataManager
import com.example.mayank.getdisciplined.ui.base.BasePresenter
import com.example.mayank.getdisciplined.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject



class SplashPresenter<V : SplashMvpView> @Inject
constructor(dataManager: DataManager,
            schedulerProvider: SchedulerProvider?,
            compositeDisposable: CompositeDisposable?) :
        BasePresenter<V>(dataManager, schedulerProvider, compositeDisposable), SplashMvpPresenter<V>{

    override fun onAttach(mvpView: V) {
        super.onAttach(mvpView)

        mvpView.openMainActivity()
    }



}

