package com.example.parcelableinkotlinmultiplatform.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.parcelableinkotlinmultiplatform.User

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val user = intent.getParcelableExtra<User>("ARG_USER")!!

        Toast.makeText(
            this, "id: ${user.id} - firstname: ${user.firstname}",
            Toast.LENGTH_LONG
        ).show()

    }
}