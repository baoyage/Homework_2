package com.example.homework_2

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.homework_2.MainActivity2
import com.example.homework_2.MainActivity3
import com.example.homework_2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(myToolbar)
        val appBar = supportActionBar
        appBar!!.title = "Homework_2"

        appBar.setDisplayShowHomeEnabled(true)
        appBar.setBackgroundDrawable(ColorDrawable(Color.parseColor("#1B82D2")))
//        appBar.setLogo(R.drawable.icu)

//        appBar.setDisplayUseLogoEnabled(true)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // inflate the menu into toolbar
        val inflater = menuInflater
        inflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        /* handle selected (pressed) toolbar menu items */
        when (item?.itemId) {
            R.id.action_act0 -> {
                val intent = Intent(this, MainActivity::class.java).apply {
                }
                startActivity(intent)
            }
            R.id.action_act1 -> {
                val intent = Intent(this, MainActivity2::class.java).apply {
                }
                startActivity(intent)
            }
            R.id.action_act2 -> {
                val intent = Intent(this, MainActivity3::class.java).apply {
                }
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}


