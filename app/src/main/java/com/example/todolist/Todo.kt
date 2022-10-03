package com.example.todolist

import java.util.zip.CheckedInputStream

data class Todo(
    val title: String,
    var isChecked: Boolean = false
)