package com.example.mayank.getdisciplined.ui.main.task.todo

import com.example.mayank.getdisciplined.data.DataManager
import com.example.mayank.getdisciplined.data.db.model.Task
import com.example.mayank.getdisciplined.ui.main.task.base.BaseTaskPresenter
import com.example.mayank.getdisciplined.utils.rx.SchedulerProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class ToDoListPresenter<V : ToDoListMvpView> @Inject constructor(dataManager: DataManager,
                                                                 schedulerProvider: SchedulerProvider,
                                                                 compositeDisposable: CompositeDisposable) :
        BaseTaskPresenter<V>(dataManager, schedulerProvider, compositeDisposable), ToDoListMvpPresenter<V> {

    override fun onAttach(mvpView: V) {
        super.onAttach(mvpView)
        mvpView.setFragment(this)
    }

    override fun getTasks(dateId: Long) {
        dataManager.getTasksToDo(dataManager.getFinishedTasksVisibility())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe ({
                    mvpView?.updateTasksList(it as ArrayList<Task>)
                }, Throwable::printStackTrace)
    }

}