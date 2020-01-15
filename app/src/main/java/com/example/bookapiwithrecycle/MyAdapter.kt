package com.example.bookapiwithrecycle

import android.R
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.bookapikotlin.VolumeInfo

    class MyAdapter(private val List: ArrayList<VolumeInfo>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

        /**
         * View holder class
         */
        inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            var title: TextView
            var sub_title: TextView?=null
            var authors: TextView?=null
            var click: TextView?=null


            init {
                title = view.findViewById(com.example.bookapiwithrecycle.R.id.txt_title)
                sub_title = view.findViewById(com.example.bookapiwithrecycle.R.id.txt_subtitle)
                authors = view.findViewById(com.example.bookapiwithrecycle.R.id.txt_authors)
                click = view.findViewById(com.example.bookapiwithrecycle.R.id.txt_click)

            }
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            val c = List[position]
            Log.v("MainActivity889898","title"+c.getTitle()+"sub_title"+c.getSubtitle()+"authors"+c.getAuthors())
            holder.title.setText(c.getTitle())
            holder.sub_title?.setText(c.getSubtitle())
            if(c.getAuthors()!=null) {
                holder.authors?.append(c.getAuthors().toString())
            }

            holder.click?.setOnClickListener { view ->
                val context=holder.title.context
                val intent = Intent( context, BookDecrip::class.java)
                intent.putExtra("Description",c.getDescription())
                context.startActivity(intent)

                Log.v("MyAdapterClicked",position.toString()+ c.getAuthors());
            }
        }

        override fun getItemCount(): Int {
            return List.size
        }



        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

            val v=LayoutInflater.from(parent.context).inflate(com.example.bookapiwithrecycle.R.layout.list_quick, parent, false)

            return MyViewHolder(v)
        }

    }