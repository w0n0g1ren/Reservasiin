package com.example.reservasiin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reservasiin.R


class HomeFragment : Fragment() {
    private lateinit var rv : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rv.findViewById<RecyclerView>(R.id.rv)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        rv.layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }



}