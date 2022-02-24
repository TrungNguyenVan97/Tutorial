package com.example.kotlinapplication.lesson12and13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinapplication.R

class Lesson12Activity : AppCompatActivity(), Adapter.IClick {

    private lateinit var rvHello: RecyclerView
    private lateinit var listHello: ArrayList<Hello>
    private lateinit var edtAdd: EditText
    private lateinit var btnAdd: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson12)

        findView()
        initView()
        initAction()
    }

    private fun initAction() {
        btnAdd.setOnClickListener {
            listHello.add(Hello(edtAdd.text.toString()))
            rvHello.adapter = Adapter(listHello, this)
        }
    }

    private fun initView() {
        rvHello.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        listHello =
            arrayListOf(Hello("Hello"), Hello("Hi"), Hello("Wine"), Hello("Chicken"), Hello("Gi"))
        rvHello.hasFixedSize()
        rvHello.adapter = Adapter(listHello, this)
    }

    private fun findView() {
        rvHello = findViewById(R.id.rvHello)
        btnAdd = findViewById(R.id.btnAdd)
        edtAdd = findViewById(R.id.edtAdd)
    }

    override fun delete(position: Int) {
        listHello.removeAt(position)
        rvHello.adapter = Adapter(listHello, this)
    }
}