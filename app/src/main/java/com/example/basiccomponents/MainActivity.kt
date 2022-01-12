package com.example.basiccomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
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

        btnOrder.setOnClickListener{
            var checkedMeatrbId = rgMeat.checkedRadioButtonId
            var meat = findViewById<RadioButton>(checkedMeatrbId)
            var cbone = cb1.isChecked
            var cbtwo = cb2.isChecked
            var cbthree = cb3.isChecked
            var orderstr = "meat ${meat.text} || "+(if(cbone) "cb1" else "") + (if(cbtwo) "cb2" else "") + (if(cbthree) " cb3" else "")
            tvSummary.text = orderstr
        }
    }

    fun clearData(){
        etFirstname.text.clear()
        etLastname.text.clear()
        etBirthdate.text.clear()
        etCountry.text.clear()
    }
}