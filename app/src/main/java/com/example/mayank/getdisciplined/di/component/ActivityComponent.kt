package com.example.mayank.getdisciplined.di.component

import com.example.mayank.getdisciplined.di.PerActivity
import com.example.mayank.getdisciplined.di.module.ActivityModule
import com.example.mayank.getdisciplined.ui.main.MainActivity
import com.example.mayank.getdisciplined.ui.main.navigationItem.ListIdNameDialog
import com.example.mayank.getdisciplined.ui.main.task.today.TaskFragment
import com.example.mayank.getdisciplined.ui.main.task.add.AddFragment
import com.example.mayank.getdisciplined.ui.main.task.list.ListFragment
import com.example.mayank.getdisciplined.ui.main.task.todo.ToDoListFragment
import com.example.mayank.getdisciplined.ui.splash.SplashActivity
import dagger.Component


@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(splashActivity: SplashActivity)
    fun inject(mainActivity: MainActivity)
    fun inject(taskFragment: TaskFragment)
    fun inject(addFragment: AddFragment)
    fun inject(toDoListFragment: ToDoListFragment)
    fun inject(listFragment: ListFragment)
    fun inject(listIdNameDialog: ListIdNameDialog)
}