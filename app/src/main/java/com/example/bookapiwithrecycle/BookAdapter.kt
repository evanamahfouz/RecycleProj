//package com.example.bookapikotlin
//
//import android.annotation.SuppressLint
//import android.content.Context
//import android.os.Build
//import android.support.annotation.RequiresApi
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ArrayAdapter
//import android.widget.TextView
//import com.example.bookapiwithrecycle.R
//import java.util.ArrayList
//
//class BookAdapter(context: Context, earthquakes: ArrayList<Item>) : ArrayAdapter<Item>(context, 0, earthquakes) {
//
//
//    @SuppressLint("ResourceAsColor")
//    @RequiresApi(api = Build.VERSION_CODES.N)
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//
//        var listItem = convertView
//        if (listItem == null) {
//            listItem = LayoutInflater.from(context).inflate(R.layout.list_quick, parent, false)
//        }
//
//        val item = getItem(position)
//
//        val IDTextView = listItem!!.findViewById(R.id.txt_ID) as TextView
//
//        IDTextView.text = item!!.getId()
//        val link = item.getSelfLink()
//
//
//        val Link_txt = listItem.findViewById(R.id.txt_link) as TextView
//        Link_txt.setText(link)
//
//
//        // set this text on the number TextView
//
//
//        return listItem
//
//
//    }
//
//
//}