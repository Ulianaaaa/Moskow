package com.example.moskow.main.service

import com.example.moskow.main.model.Mood
import retrofit2.Response
import retrofit2.http.GET

interface InterfaceTwo {
    @GET("/ping")
    suspend fun getMood() : Response<Mood>
}