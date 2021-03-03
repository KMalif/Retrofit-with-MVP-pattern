package com.example.mvprecycler.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIService {

    val Base_URL : String = "https://demo.lazday.com/rest-api-sample/"
    val endpoint : APIEndpoint
        get() {
            val retrofit = Retrofit.Builder().baseUrl(Base_URL).addConverterFactory(GsonConverterFactory.create()).build()
            return retrofit.create(APIEndpoint::class.java)
        }
}