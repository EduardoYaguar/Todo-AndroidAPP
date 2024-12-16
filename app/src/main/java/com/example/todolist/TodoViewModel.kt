package com.example.todolist

import android.icu.text.CaseMap.Title
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.time.Instant
import java.util.Date

class TodoViewModel: ViewModel() {

    val todoDao = MainApp.todoDatabase.getTodoDao()

    val todoList: LiveData<List<Todo>> = todoDao.getAlltodo()


    fun addTodo(title: String){
        viewModelScope.launch(Dispatchers.IO) {
            todoDao.addTodo(Todo(title = title, createdAt = Date.from(Instant.now())))
        }

    }
}