package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.R.attr.name

import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.messageText)
        val editText = findViewById<EditText>(R.id.editor)

        findViewById<Button>(R.id.button).setOnClickListener {
            if (editText.text.isEmpty()) {
                textView.text = "Please enter a name."
            }
            else {
                textView.text = "Hello, " + editText.text + ". Welcome!"
            }

        }

    }
}