package com.example.mayank.getdisciplined.ui.main.task.base

import android.util.Log
import com.example.mayank.getdisciplined.data.DataManager
import com.example.mayank.getdisciplined.data.db.model.Task
import com.example.mayank.getdisciplined.ui.base.BasePresenter
import com.example.mayank.getdisciplined.utils.AppUtils
import com.example.mayank.getdisciplined.utils.rx.SchedulerProvider
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.experimental.channels.actor
import kotlinx.coroutines.experimental.delay
import javax.inject.Inject


open class BaseTaskPresenter<V: BaseTaskMvpView> @Inject constructor(dataManager: DataManager,
                                                                     schedulerProvider: SchedulerProvider,
                                                                     compositeDisposable: CompositeDisposable) :
        BasePresenter<V>(dataManager, schedulerProvider, compositeDisposable), BaseTaskMvpPresenter<V> {



    private val TAG = "BaseTaskPresenter"

    var todayId: Long = 0

    override fun isTodayExist() {
        val isTodayExist = Observable.fromCallable { dataManager.getDateId(AppUtils.getToday()) }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext {
                    Log.d(TAG, "CHECK : $it")
                    if (it.isEmpty()) dataManager.addDate(AppUtils.getToday())
                }

        val getTask = Observable.fromCallable { dataManager . getDateId (AppUtils.getToday()) }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext {
                    if(it.isNotEmpty()) {
                        Log.d(TAG, "DATE : $it")
                        val dateId = it[0].id
                        todayId = dateId
                        getTasks(dateId)
                    }
                }

        Observable.concat(isTodayExist, getTask).subscribe()
    }

    override fun getTasks(dateId: Long) {
        Log.d(TAG, "BASE GET TASKS")
        dataManager.getTasksByDayId(dateId, dataManager.getFinishedTasksVisibility())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe ({
                    mvpView?.updateTasksList(it as ArrayList<Task>)
                }, Throwable::printStackTrace)
    }

    override fun getTasksVisibility() {
        mvpView?.updateTasksVisibilityIcon(dataManager.getFinishedTasksVisibility())
    }

    override fun changeTaskVisibility() {
        dataManager.setFinishedTasksVisibility(!dataManager.getFinishedTasksVisibility())
        mvpView?.updateTasksVisibilityIcon(dataManager.getFinishedTasksVisibility())
        (mvpView as BaseTaskFragment).updateTasksArray()
    }
}