package com.example.task1practiceapp   // ⚠ Keep YOUR package name if different

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.myButton)
        val textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            textView.text = "Button Clicked!"
            Toast.makeText(this, "You clicked the button!", Toast.LENGTH_SHORT).show()
        }
    }
}
