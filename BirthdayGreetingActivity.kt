package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    private lateinit var textUserName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        textUserName = findViewById(R.id.birtdayGreeting)

        val username = intent.getStringExtra("username")
        textUserName.text = "Happy BirthDay \n"+ username
    }
}