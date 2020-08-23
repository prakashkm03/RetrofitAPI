package com.example.retrofitapi

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Model(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)