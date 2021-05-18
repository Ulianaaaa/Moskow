package com.example.moskow.main.service

import com.example.moskow.login.service.Interface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object InstanceTwo {
    private val BASE_URL2 = "http://mskko2021.mad.hakta.pro/api"
    private val retrofit2 = Retrofit.Builder().baseUrl(BASE_URL2)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    val apiServ2 = retrofit2.create(InterfaceTwo::class.java)
}