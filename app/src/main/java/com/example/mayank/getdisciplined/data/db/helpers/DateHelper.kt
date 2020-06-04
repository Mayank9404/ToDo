package com.example.mayank.getdisciplined.data.db.helpers

import com.example.mayank.getdisciplined.data.db.model.Date
import io.reactivex.Flowable
import io.reactivex.Maybe
import io.reactivex.Single


interface DateHelper {
    fun addDate(date: Long)

    fun getDateId(date: Long): List<Date>
}