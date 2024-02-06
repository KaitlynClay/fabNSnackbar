package com.example.fabnsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Snackbar.make(findViewById(android.R.id.content), "New page", Snackbar.LENGTH_LONG).setAction("Action", null).show()

    }
}