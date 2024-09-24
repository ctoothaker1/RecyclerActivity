package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val numbers  = Array<Int> [1,2,3,4,5,6]

        // TODO Step 1: Reference RecyclerView object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        //TODO Step 2: Provide a LayoutManager

        recyclerView.layoutManager = LinearLayoutManager(this)
        //recyclerView.adapter =

        //TODO Step 4: Provide a RecyclerView.Adapter
        val numbers  = arrayOf(1,2,3,4,5,6)
        recyclerView.adapter = NumberDisplayAdapter(numbers)

    }
}