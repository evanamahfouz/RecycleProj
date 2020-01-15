package com.example.bookapiwithrecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.view.Gravity


class BookDecrip : AppCompatActivity() {
    var txt:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_decrip)
        txt=findViewById(R.id.text_desc)
        val i = intent
       var desc:String?=null
       desc= i.getStringExtra("Description")
        if(desc!=null) {
            txt?.setText(desc)
        }else{
            txt?.setText("No Description Avaliable Yet ")
            txt?.setTextColor(resources.getColor(R.color.colorAccent))
            txt?.setPadding(32,0,0,0)
        }

    }
}
