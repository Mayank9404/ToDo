package com.example.mayank.getdisciplined.ui.main.navigationItem

import com.example.mayank.getdisciplined.data.DataManager
import com.example.mayank.getdisciplined.data.db.model.ListId
import com.example.mayank.getdisciplined.ui.base.BasePresenter
import com.example.mayank.getdisciplined.utils.rx.SchedulerProvider
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class ListIdNameDialogPresenter<V : ListIdNameDialogMvpView>
    @Inject constructor(dataManager: DataManager,
                        schedulerProvider: SchedulerProvider?,
                        compositeDisposable: CompositeDisposable?)
    : BasePresenter<V>(dataManager, schedulerProvider, compositeDisposable), ListIdNameDialogMvpPresenter<V>  {

    override fun updateListId(listId: ListId) {
        Single.fromCallable {
            dataManager.updateListId(listId)
        }.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe ({
            mvpView?.updateIdListTitleToolbar()
            mvpView?.dismissDialog()
        }, Throwable::printStackTrace)
    }

    override fun cancelListId(listId: ListId) {
        Single.fromCallable {
            dataManager.deleteListId(listId)
        }.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe ({
                    mvpView?.cancelCreatingListId()
                    mvpView?.dismissDialog()
                }, Throwable::printStackTrace)
    }

}