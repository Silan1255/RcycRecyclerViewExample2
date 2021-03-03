package com.example.rcyclerviewexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rcyclerviewexample2.Adapter.DemoListAdapter
import com.example.rcyclerviewexample2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var array: ArrayList<String> = arrayListOf()
        array.add("GALATASARAY")
        array.add("FENERBAHÇE")
        array.add("BEŞİKTAŞ")
        array.add("TRABZONSPOR")
        binding.futbolTakimleri.layoutManager= LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL,false)
        binding.futbolTakimleri.adapter= DemoListAdapter(array)

    }
}