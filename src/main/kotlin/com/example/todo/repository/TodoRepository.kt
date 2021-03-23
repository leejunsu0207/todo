package com.example.todo.repository

import com.example.todo.database.Todo

interface TodoRepository {

    fun save(todo: Todo): Todo?
    fun savaAll(todoList: MutableList<Todo>): Boolean

    fun delete(index : Int): Boolean

    fun findOne(index : Int): Todo?
    fun findAll(): MutableList<Todo>
}