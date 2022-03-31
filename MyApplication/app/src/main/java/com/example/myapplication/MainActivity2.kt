package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button2.setOnClickListener {
            val searchIntent = Intent(this, SearchActivity::class.java)
            searchIntent.putExtra("adres", editTextNumber.text.toString())
            startActivity(searchIntent)

            if(editTextNumber.text.toString().length==0){
                Toast.makeText(this, "Enter address!", Toast.LENGTH_SHORT).show()
                startActivity(intent)
                return@setOnClickListener
            }


        }
    }
}