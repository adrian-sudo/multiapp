package com.adrianlozano.androidmaster.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adrianlozano.androidmaster.R

class TasksAdapter (private val tasks:List<Task>) :RecyclerView.Adapter<TasksViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_todo_task, parent, false)
            return  TasksViewHolder(view)

    }

    override fun getItemCount() =  tasks.size

    override fun onBindViewHolder(holder: TasksViewHolder, position: Int) {
        holder.render(tasks[position])
    }
}