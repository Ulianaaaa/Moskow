package com.example.moskow.login.repository

import com.example.moskow.login.model.Users
import com.example.moskow.login.service.Instance
import retrofit2.Response

class Repository {
    suspend fun loginUser(users: Users): Response<Users> {
        return Instance.apiServ.loginUser(users)
    }
}