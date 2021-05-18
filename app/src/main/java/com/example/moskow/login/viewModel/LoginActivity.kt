package com.example.moskow.login.viewModel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.moskow.main.mainView.MainActivity
import com.example.moskow.R
import com.example.moskow.Register
import com.example.moskow.login.model.Users
import com.example.moskow.login.repository.Repository
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    fun clickToRegister(view: View) {
        val intent = Intent(this, Register::class.java)
        startActivity(intent)
    }

    fun clickToMain(view: View) {

        //val editText = editTextTextPersonName.findViewById<EditText>(R.id.editTextTextPersonName)
        val email = editTextTextPersonName.text.toString()
       // val editPassword =
       //     editTextTextPersonName2.findViewById<EditText>(R.id.editTextTextPersonName2)
        val password = editTextTextPersonName2.text.toString()

        if (email.isEmpty() || password.isEmpty()) {
            val duration = Toast.LENGTH_SHORT
            Toast.makeText(this, "Поле пустое", duration).show()

        } else {
            val repository = Repository()
            val viewModelFactory = MainViewModelFactory(repository)
            viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
            viewModel.loginUser(Users(email, password))

            viewModel.myResponse.observe(this, Observer { response ->
                Log.d("Response", response.body().toString())


            })

            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)

        }
    }
}