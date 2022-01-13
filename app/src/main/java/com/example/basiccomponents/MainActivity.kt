package com.example.basiccomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnApply.setOnClickListener{
            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()
            val country = etCountry.text.toString()
            val person = Person(name, age, country)
            Intent(this,SecondActivity::class.java).also {
                it.putExtra("EXTRA_PERSON", person)
                startActivity(it)
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.miAddContact -> Toast.makeText(this, "Clicked add contact", Toast.LENGTH_SHORT).show()
            R.id.miFavourite -> Toast.makeText(this, "Clicked Favourite", Toast.LENGTH_SHORT).show()
            R.id.miClose -> Toast.makeText(this, "Clicked Close", Toast.LENGTH_SHORT).show()
            R.id.miSetting -> Toast.makeText(this, "Clicked Setting", Toast.LENGTH_SHORT).show()
            R.id.miFeedback -> Toast.makeText(this, "Clicked Feedback", Toast.LENGTH_SHORT).show()

        }

        return true
    }


}