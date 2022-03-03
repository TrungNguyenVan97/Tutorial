package com.example.kotlinapplication.bottomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinapplication.R

class HomeFragment : BaseFragment() {

    private lateinit var edtHome: EditText
    private lateinit var rvHome: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        edtHome = view.findViewById(R.id.edt_Home)
        rvHome = view.findViewById(R.id.rv_home_list)

        rvHome.layoutManager = LinearLayoutManager(view.context)

        val list: ArrayList<Person> = arrayListOf()
        list.add(Person("Trung"))
        list.add(Person("Anh"))
        list.add(Person("Hảo"))
        list.add(Person("Hương"))
        list.add(Person("Dũng"))
        list.add(Person("Dũng"))
        list.add(Person("Dũng"))
        list.add(Person("Dũng"))
        list.add(Person("Dũng"))
        list.add(Person("Dũng"))
        list.add(Person("Dũng"))
        list.add(Person("Dũng"))
        list.add(Person("Dũng"))
        list.add(Person("Dũng"))
        list.add(Person("Dũng"))
        list.add(Person("Dũng"))

        rvHome.adapter = PersonAdapter(list)

        return view
    }
}