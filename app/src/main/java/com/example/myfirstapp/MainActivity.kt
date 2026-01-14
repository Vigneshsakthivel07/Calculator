package com.example.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.Num_1)
        val num2 = findViewById<EditText>(R.id.Num_2)
        val result = findViewById<TextView>(R.id.tvResult)

        findViewById<Button>(R.id.btnAdd).setOnClickListener {
            result.text = calculate(num1, num2, "+")
        }

        findViewById<Button>(R.id.btnSub).setOnClickListener {
            result.text = calculate(num1, num2, "-")
        }

        findViewById<Button>(R.id.btnMul).setOnClickListener {
            result.text = calculate(num1, num2, "*")
        }

        findViewById<Button>(R.id.btnDiv).setOnClickListener {
            result.text = calculate(num1, num2, "/")
        }
    }

    private fun calculate(n1: EditText, n2: EditText, op: String): String {

        if (n1.text.isEmpty() || n2.text.isEmpty()) {
            return "Enter values"
        }

        val a = n1.text.toString().toDouble()
        val b = n2.text.toString().toDouble()

        return when (op) {
            "+" -> (a + b).toString()
            "-" -> (a - b).toString()
            "*" -> (a * b).toString()
            "/" -> {
                if (b == 0.0) "Cannot divide by zero"
                else (a / b).toString()
            }
            else -> "Invalid Operation"
        }
    }
}
