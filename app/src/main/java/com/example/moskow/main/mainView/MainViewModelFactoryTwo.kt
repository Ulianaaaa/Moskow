package com.example.moskow.main.mainView

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.moskow.main.repository.RepositoryTwo

class MainViewModelFactoryTwo (private val repositoryTwo: RepositoryTwo) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModelTwo(repositoryTwo) as T
    }
}