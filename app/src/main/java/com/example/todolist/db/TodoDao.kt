package com.example.todolist.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.todolist.Todo

@Dao
interface TodoDao {
    @Query("SELECT * FROM TODO")
    fun getAlltodo() : LiveData<List<Todo>>
    @Insert
    fun addTodo(todo: Todo)

}