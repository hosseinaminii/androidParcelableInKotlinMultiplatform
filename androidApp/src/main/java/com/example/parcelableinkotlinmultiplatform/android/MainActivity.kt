package com.example.parcelableinkotlinmultiplatform.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.parcelableinkotlinmultiplatform.Greeting
import android.widget.TextView
import com.example.parcelableinkotlinmultiplatform.User

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpen: Button = findViewById(R.id.btnOpe)

        btnOpen.setOnClickListener {
            val user = User(100, "Hossein")
            startActivity(Intent(this, SecondActivity::class.java).apply {
                putExtra("ARG_USER", user)
            })
        }
    }
}
