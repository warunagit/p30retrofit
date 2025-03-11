package com.cycolabs.p30retrofit

import com.google.gson.annotations.SerializedName

data class AlbumItem(
    @SerializedName("id")
    val id: Int,
    @SerializedName("usrtId")
    val userId: Int,
    @SerializedName("title")
    val title: String
)
//album item properties are defined here, which receives from JSON
// @SerializedName("name")
//    val title: String
//get the json value from "title", then show as "name"