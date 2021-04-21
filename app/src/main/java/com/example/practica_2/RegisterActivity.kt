package com.example.practica_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practica_2.databinding.ActivityRegister2Binding

class RegisterActivity : AppCompatActivity()
{
    private lateinit var register2Binding: ActivityRegister2Binding


    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register2)
        register2Binding = ActivityRegister2Binding.inflate(layoutInflater)
        setContentView(register2Binding.root)



        register2Binding.guardarButton.setOnClickListener {

            val  name = register2Binding.nameTextInputEdit.text.toString()
            val email = register2Binding.emailTextInputEdit.text.toString()
            val doc = register2Binding.documentTextInputEdit.text.toString()
            val numciv = register2Binding.numercivTextInputEdit.text.toString()
            val pass = register2Binding.passwordTextInputEdit.text.toString()

            val valor= name.length

            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("name", register2Binding.nameTextInputEdit.text.toString())
            startActivity(intent)
            finish()
        }

    }

    private  fun salveUser(name: String, email: String, doc: String, numciv: String, pass: String )
    {
        val newUser = User(name, email, doc, numciv, pass)
    }

}