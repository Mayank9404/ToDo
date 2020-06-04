package com.example.mayank.getdisciplined.data.db.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity
data class Date (
        @PrimaryKey(autoGenerate = true)
        val id: Long,
        var date: Long
)
