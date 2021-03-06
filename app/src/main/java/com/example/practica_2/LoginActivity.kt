package com.example.practica_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practica_2.databinding.ActivityLogin2Binding

class LoginActivity : AppCompatActivity()
{
    private lateinit var login2Binding: ActivityLogin2Binding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        login2Binding = ActivityLogin2Binding.inflate(layoutInflater)
        setContentView(login2Binding.root)

        login2Binding.logindButton.setOnClickListener { 

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("email", login2Binding.UserInputEditText.text.toString())
            startActivity(intent)
            finish()
        }

        login2Binding.registerButton.setOnClickListener {

            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}