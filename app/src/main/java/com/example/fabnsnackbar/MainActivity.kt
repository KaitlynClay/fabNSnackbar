package com.example.fabnsnackbar

import android.content.Intent
import android.hardware.biometrics.BiometricManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var fab: FloatingActionButton
    lateinit var moveOnClickListener: View.OnClickListener


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab = findViewById(R.id.fab1)

        fab.setOnClickListener{
            var intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)        }

        moveOnClickListener = View.OnClickListener {

        }

    }

}