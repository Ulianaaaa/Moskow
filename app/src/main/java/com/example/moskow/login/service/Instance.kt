package com.example.moskow.login.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Instance {
    private val BASE_URL = "http://mskko2021.mad.hakta.pro/api/user/"
    private val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val apiServ = retrofit.create(Interface::class.java)
}