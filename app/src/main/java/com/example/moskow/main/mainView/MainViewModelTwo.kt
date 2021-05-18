package com.example.moskow.main.mainView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moskow.main.model.Mood
import com.example.moskow.main.repository.RepositoryTwo
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModelTwo(private val repositoryTwo: RepositoryTwo) : ViewModel() {
    val myResponse2 : MutableLiveData<Response<Mood>> = MutableLiveData()
    fun getMood() {
        viewModelScope.launch {
            var response2 = repositoryTwo.getMood()
            myResponse2.value = response2
        }

    }
}