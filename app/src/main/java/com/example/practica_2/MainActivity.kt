package com.example.practica_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.example.practica_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        val data = intent.extras
        mainBinding.emailTextView.text = data?.getString("email")

        Log.d("metodo" , "onCreate")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.logout_menu->
                {
                    val intent = Intent(this,LoginActivity::class.java)
                    startActivity(intent)
                    finish()
                }

        }
        return super.onOptionsItemSelected(item)
    }

    override fun onStart() {
        super.onStart()
        Log.d("metodo" , "onStart")
    }

    override fun onResume()
    {
        super.onResume()
        Log.d("metodo" , "onResume")
    }


}