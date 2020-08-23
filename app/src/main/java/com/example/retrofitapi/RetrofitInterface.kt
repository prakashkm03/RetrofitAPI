package com.example.retrofitapi

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {


    @GET("posts")
    fun getPosts(): Call<List<Model>>




}