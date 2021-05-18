package com.example.moskow.login.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moskow.login.model.Users
import com.example.moskow.login.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository) : ViewModel() {
     val myResponse : MutableLiveData<Response<Users>> = MutableLiveData()
    fun loginUser(users: Users){
        viewModelScope.launch {
            var response = repository.loginUser(users)
            myResponse.value = response
        }
    }

}