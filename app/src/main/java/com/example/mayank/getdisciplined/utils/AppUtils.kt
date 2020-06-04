package com.example.mayank.getdisciplined.utils

import android.widget.ImageView
import java.util.*


class AppUtils {
    companion object {
        fun isToday(date: Long): Boolean = getToday() == date

        fun getToday(): Long {
            val day = Date()
            val calendar = Calendar.getInstance()
            calendar.time = day
            return "${calendar.get(Calendar.YEAR)}${calendar.get(Calendar.DAY_OF_YEAR)}".toLong()
        }

        fun makeDate(date: Long): String {
            val calendar = Calendar.getInstance()

            val year = date.toString().take(4).toInt()

            calendar.set(Calendar.YEAR, year)
            calendar.set(Calendar.DAY_OF_YEAR, date.toString().takeLast(date.toString().length - 4).toInt())


            return "${calendar.get(Calendar.YEAR)} / ${calendar.get(Calendar.MONTH) + 1} / ${calendar.get(Calendar.DAY_OF_MONTH)}"


        }
    }





}