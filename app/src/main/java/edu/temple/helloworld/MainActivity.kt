package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        val name = findViewById<EditText>(R.id.nameEditText)
        val button = findViewById<Button>(R.id.clickMeButton)
        val text = findViewById<TextView>(R.id.displayTextView)
        
        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            displayTextView.text = "Hello, ${findViewById<EditText>(R.id.nameEditText).text}"
        }
        button.setOnClickListener {
            var isValid =true

            if (name.text.isEmpty()) {
                name.error = "Name is required"
                isValid = false
            }
            if (isValid == true) {
                // Update the TextView with a welcome message
                text.text = "Hello, ${name.text}!"
            }
        }


    }
}