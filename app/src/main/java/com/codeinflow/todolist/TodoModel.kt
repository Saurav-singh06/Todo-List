package com.codeinflow.todolist

import androidx.room.PrimaryKey

data class TodoModel(
     var title:String,
     var declaration:String,
     var category:String,
     var data:Long,
     var time : Long,
     var ifFinished : Int = -1,
     @PrimaryKey
     var id:Long =0
)