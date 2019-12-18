package com.kazishihan.retrokot

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

typealias Welcome = DataModel
data class DataModel (




    val userID: Long,
    val id: Long,
    val title: String,
    val body: String

//    @SerializedName("userId")
//    @Expose
//   var userId: Int? = null
//
//
//
//    @SerializedName("id")
//    @Expose
//    var id: Int? = null
//
//
//    @SerializedName("title")
//    @Expose
//    var title: String? = null
//
//
//    @SerializedName("body")
//    @Expose
//    var body: String? = null


)


