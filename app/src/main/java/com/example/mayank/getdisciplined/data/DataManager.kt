package com.example.mayank.getdisciplined.data

import com.example.mayank.getdisciplined.data.db.helpers.DateHelper
import com.example.mayank.getdisciplined.data.db.helpers.ListIdHelper
import com.example.mayank.getdisciplined.data.db.helpers.TaskHelper
import com.example.mayank.getdisciplined.data.db.model.Date
import com.example.mayank.getdisciplined.data.db.model.ListId
import com.example.mayank.getdisciplined.data.db.model.Task
import com.example.mayank.getdisciplined.data.prefs.PreferencesHelper
import io.reactivex.Flowable
import io.reactivex.Single



interface DataManager : PreferencesHelper, DateHelper, ListIdHelper, TaskHelper