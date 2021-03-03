package com.example.mvprecycler.model.api

import com.example.mvprecycler.interfaces.Constant
import com.example.mvprecycler.model.datamodel.Country
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface JobServices {
    @GET(Constant.CAPITAL)
    fun getCountry(@Path("capital") capital : String): Call<List<Country>>


}