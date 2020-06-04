package com.example.mayank.getdisciplined.data.db.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity
data class ListId(
   @PrimaryKey(autoGenerate = true)
   val id: Long,
   var name: String,
   var listOrder: Long

)