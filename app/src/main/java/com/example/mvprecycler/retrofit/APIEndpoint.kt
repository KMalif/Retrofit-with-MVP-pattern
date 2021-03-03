package com.example.mvprecycler.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface APIEndpoint {
    @GET("data.php")
    fun getPhotos(): Call<MainModel>
}