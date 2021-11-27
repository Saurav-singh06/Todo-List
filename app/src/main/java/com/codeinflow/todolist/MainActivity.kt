package com.codeinflow.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    val todos = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAddTodo = findViewById<Button>(R.id.btnAdd)
        val etTxt = findViewById<EditText>(R.id.etTxt)
        val lv = findViewById<ListView>(R.id.lv)
        val todoAdapter = ArrayAdapter<String>(
                this,android.R.layout.simple_list_item_1,
                android.R.id.text1,
                todos
        )

        lv.adapter = todoAdapter

        btnAddTodo.setOnClickListener {
            val newTodo = etTxt.text.toString()

            todoAdapter.add(newTodo)
            todoAdapter.notifyDataSetChanged()
        }
    }
}