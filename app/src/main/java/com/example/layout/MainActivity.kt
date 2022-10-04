package com.example.layout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Estado","he creado!!!")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Estado","OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Estado","OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Estado","OnPause ")
    }
}