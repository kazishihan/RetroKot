package com.kazishihan.retrokot

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.list_view_design.view.*
import java.lang.Exception
import kotlin.math.log

class RecyclerViewAdapter(var list:List<JsonObject>, var context: Context):
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

       return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_view_design,parent,false))
    }

    override fun getItemCount(): Int {
      return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

//        var DataList:DataModel=list.get(position)
//
//        var ab: Welcome=list.get(position)
//
//        holder.id.text=ab.id.toString()
//        holder.title.text=ab.title.toString()



        /////get data from object////

            var ss =list.get(position).get("userId").toString()
            var some:String



        holder.id.text=list.get(position).get("id").toString()
        holder.title.text=list.get(position).get("title").toString()





        var s =""

    }


    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to

        var id:TextView=view.idTv_Id
        var title:TextView=view.titl_Id
    }
}




