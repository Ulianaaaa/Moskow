package com.example.moskow.main.mainView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.moskow.R
import com.example.moskow.main.model.Mood
import com.example.moskow.main.repository.RepositoryTwo
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
//    private lateinit var viewModelTwo: MainViewModelTwo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        val repository2 = RepositoryTwo()
//        val viewModelFactoryTwo = MainViewModelFactoryTwo(repository2)
//        viewModelTwo = ViewModelProvider(this, viewModelFactoryTwo).get(MainViewModelTwo::class.java)
//        viewModelTwo.getMood()
//        viewModelTwo.myResponse2.observe(this, Observer { response ->
//            Log.d("Response" , response.body().toString().trim())
//        })
//
//        var arrayList: ArrayList<Mood> = ArrayList()

    }
}