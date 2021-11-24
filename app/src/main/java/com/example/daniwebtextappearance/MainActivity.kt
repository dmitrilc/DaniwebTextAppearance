package com.example.daniwebtextappearance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.TextViewCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TextViewCompat.setTextAppearance(
            findViewById(R.id.textView_helloWorld),
            R.style.TextAppearance_AppCompat_Medium)
    }
}