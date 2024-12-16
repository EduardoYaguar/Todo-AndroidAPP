package com.example.todolist

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import com.example.todolist.db.TodoDatabase

class MainApp : Application() {
    companion object{
        lateinit var todoDatabase: TodoDatabase
    }

    override fun onCreate() {
        super.onCreate()
        todoDatabase =  Room.databaseBuilder(
            applicationContext,
            TodoDatabase::class.java,
            TodoDatabase.NAME
        ).build()
    }
}