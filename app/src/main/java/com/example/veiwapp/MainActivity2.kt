package com.example.veiwapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    val array = arrayOf("CHAPTER 1","CHAPTER 2","CHAPTER 3","CHAPTER 4","CHAPTER 5","CHAPTER 6","CHAPTER 7","CHAPTER 8",
        "CHAPTER 9","CHAPTER 10","CHAPTER 11","CHAPTER 12","CHAPTER 13","CHAPTER 14","CHAPTER 15",)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val adapter = ArrayAdapter(this,R.layout.list_view_model,array)
        val listview:ListView = findViewById(R.id.list_view)
        listview.setAdapter(adapter)

        listview.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val itemvalue:String = array[position]
                val i = Intent(this@MainActivity2,MainActivity3::class.java)
                i.putExtra("name",itemvalue)
                startActivity(i)
                Toast.makeText(applicationContext, "value: $itemvalue", Toast.LENGTH_SHORT).show()

            }
        }
    }
}