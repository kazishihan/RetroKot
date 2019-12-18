package com.kazishihan.retrokot.Retrofit

import com.google.gson.JsonObject
import com.kazishihan.retrokot.DataModel
import retrofit2.http.GET
import retrofit2.Call

interface ApiInterface {


    @GET("posts")
    fun getPosts(): Call<List<JsonObject>>
}