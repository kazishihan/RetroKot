package com.kazishihan.retrokot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.JsonObject
import com.kazishihan.retrokot.Retrofit.RetrofitClass
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class MainActivity : AppCompatActivity() {



    private lateinit var recyclerview:RecyclerView
    private lateinit var recyclerViewAdapter:RecyclerViewAdapter
    var dataList = ArrayList<JsonObject>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview=recyclerViewId
        recyclerViewAdapter= RecyclerViewAdapter(dataList,this)
        recyclerview.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerview.adapter=recyclerViewAdapter
        getdata()

    }


    private fun getdata()
    {

        val dataCall: Call<List<JsonObject>> =  RetrofitClass().getClient.getPosts()
        dataCall.enqueue(object : Callback<List<JsonObject>> {

            override fun onResponse(call: Call<List<JsonObject>>, response: Response<List<JsonObject>>) {


                response.body()

                var data:List<JsonObject>? = response.body()



                dataList.addAll(response!!.body()!!)

               recyclerview.adapter?.notifyDataSetChanged()
              //  recyclerViewAdapter= RecyclerViewAdapter(,applicationContext)


            }

            override fun onFailure(call: Call<List<JsonObject>>?, t: Throwable?) {


            }

        })
    }
}
