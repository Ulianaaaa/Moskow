package com.example.moskow.main.repository

import com.example.moskow.main.model.Mood
import com.example.moskow.main.service.InstanceTwo
import retrofit2.Response

class RepositoryTwo {
    suspend fun getMood() : Response<Mood>{
        return InstanceTwo.apiServ2.getMood()
    }
}