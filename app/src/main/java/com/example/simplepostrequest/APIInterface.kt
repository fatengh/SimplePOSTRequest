package com.example.simplepostrequest

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface APIInterface {
    @POST("/custom-people/")
    fun addUser(@Body userData:DataItem):Call<DataItem?>
}