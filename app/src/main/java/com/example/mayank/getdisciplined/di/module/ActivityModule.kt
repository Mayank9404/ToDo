package com.example.mayank.getdisciplined.di.module

import android.content.Context
import android.support.v7.app.AppCompatActivity
import com.example.mayank.getdisciplined.di.ActivityContext
import com.example.mayank.getdisciplined.di.PerActivity
import com.example.mayank.getdisciplined.ui.main.MainMvpPresenter
import com.example.mayank.getdisciplined.ui.main.MainMvpView
import com.example.mayank.getdisciplined.ui.main.MainPresenter
import com.example.mayank.getdisciplined.ui.main.navigationItem.ListIdNameDialogMvpPresenter
import com.example.mayank.getdisciplined.ui.main.navigationItem.ListIdNameDialogMvpView
import com.example.mayank.getdisciplined.ui.main.navigationItem.ListIdNameDialogPresenter
import com.example.mayank.getdisciplined.ui.main.task.today.TaskMvpPresenter
import com.example.mayank.getdisciplined.ui.main.task.today.TaskMvpView
import com.example.mayank.getdisciplined.ui.main.task.today.TaskPresenter
import com.example.mayank.getdisciplined.ui.main.task.add.AddMvpPresenter
import com.example.mayank.getdisciplined.ui.main.task.add.AddMvpView
import com.example.mayank.getdisciplined.ui.main.task.add.AddPresenter
import com.example.mayank.getdisciplined.ui.main.task.list.ListMvpPresenter
import com.example.mayank.getdisciplined.ui.main.task.list.ListMvpView
import com.example.mayank.getdisciplined.ui.main.task.list.ListPresenter
import com.example.mayank.getdisciplined.ui.main.task.todo.ToDoListMvpPresenter
import com.example.mayank.getdisciplined.ui.main.task.todo.ToDoListMvpView
import com.example.mayank.getdisciplined.ui.main.task.todo.ToDoListPresenter
import com.example.mayank.getdisciplined.ui.splash.SplashMvpPresenter
import com.example.mayank.getdisciplined.ui.splash.SplashMvpView
import com.example.mayank.getdisciplined.ui.splash.SplashPresenter
import com.example.mayank.getdisciplined.utils.rx.AppSchedulerProvider
import com.example.mayank.getdisciplined.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable


@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @Provides
    @ActivityContext
    fun provideContext(): Context = activity

    @Provides
    fun provideActivity(): AppCompatActivity = activity

    @Provides
    fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    @PerActivity
    fun provideSplashPresenter(presenter: SplashPresenter<SplashMvpView>): SplashMvpPresenter<SplashMvpView> = presenter

    @Provides
    @PerActivity
    fun provideMainPresenter(presenter: MainPresenter<MainMvpView>): MainMvpPresenter<MainMvpView> = presenter

    @Provides
    fun provideListIdNameDialogPresenter(presenter: ListIdNameDialogPresenter<ListIdNameDialogMvpView>): ListIdNameDialogMvpPresenter<ListIdNameDialogMvpView> = presenter

    @Provides
    fun provideTaskMvpPresenter(presenter: TaskPresenter<TaskMvpView>): TaskMvpPresenter<TaskMvpView> = presenter

    @Provides
    fun provideSchedulerManager(): SchedulerProvider = AppSchedulerProvider()

    @Provides
    fun provideAddMvpPresenter(presenter: AddPresenter<AddMvpView>): AddMvpPresenter<AddMvpView> = presenter

    @Provides
    fun provideListMvpPresenter(presenter: ListPresenter<ListMvpView>) : ListMvpPresenter<ListMvpView> = presenter

    @Provides
    fun provideToDoListMvpPresenter(presenter: ToDoListPresenter<ToDoListMvpView>): ToDoListMvpPresenter<ToDoListMvpView> = presenter
}