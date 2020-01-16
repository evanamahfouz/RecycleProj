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
import kotlinx.android.synthetic.main.list_quick.view.*
import org.jetbrains.anko.find

class MyAdapter(private val List: ArrayList<VolumeInfo>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

        /**
         * View holder class
         */
        inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            var title: TextView?=null
            var sub_title: TextView?=null
            var authors: TextView?=null
            var click: TextView?=null


            init {
                view.apply {
                    title =txt_title
                    sub_title = txt_subtitle
                    authors = txt_authors
                    click = txt_click
                }


            }
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            val c = List[position]

           holder.apply {
               title?.text=c.title
               sub_title?.text=(c.subtitle)
                if(c.authors!=null) {
                    holder.authors?.append(c.authors.toString())
                }

                click?.setOnClickListener {
                    val context=title?.context
                    val intent = Intent( context, BookDecrip::class.java)
                    intent.putExtra("Description",c.description)
                    context?.startActivity(intent)

                    Log.v("MyAdapterClicked",position.toString()+ c.authors);
                }
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