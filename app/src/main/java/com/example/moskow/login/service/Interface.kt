package com.example.moskow.login.service

import com.example.moskow.login.model.Users
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface Interface {
    @POST ("login")
    suspend fun loginUser(
        @Body users: Users
    ): Response<Users>
}