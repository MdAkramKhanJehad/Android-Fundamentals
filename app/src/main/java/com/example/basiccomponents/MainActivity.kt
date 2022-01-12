package com.example.basiccomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0
        btnApply.setOnClickListener{
            count++
            var fn = etFirstname.text.toString()
            var ln = etLastname.text.toString()
            var cn = etCountry.text.toString()

            Log.d("Main AActivity", "$fn || $ln  || $cn")
            clearData()
            tvCount.text = "$count"
        }
    }

    fun clearData(){
        etFirstname.text.clear()
        etLastname.text.clear()
        etBirthdate.text.clear()
        etCountry.text.clear()
    }
}