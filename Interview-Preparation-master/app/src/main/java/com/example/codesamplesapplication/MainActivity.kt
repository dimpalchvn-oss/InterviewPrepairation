package com.example.codesamplesapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            CustomDialogBuilder(this)
                .setTitle("Showing Dialog")
                .setMessage("Showing dialog with builder pattern.")
                .onOk{
                    Toast.makeText(this, "Hello, I am here!", Toast.LENGTH_SHORT).show()
                }
                .show()
            }
    }
}