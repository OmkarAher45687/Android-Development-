package com.example.birthdaygreet

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnSendData: Button
    private lateinit var edituserName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendData = findViewById(R.id.createBirthdayButton)
        edituserName = findViewById(R.id.editTextTextPersonName)

        btnSendData.setOnClickListener {
            startActivity(Intent(this, BirthdayGreetingActivity :: class.java)
                .putExtra("username", edituserName.text.toString())
            )
        }



    }



}