Basic Calculator Android Application (Kotlin)
Project Description

This project is a Basic Calculator Android Application developed using Kotlin and Android Studio.
The application allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, and division by entering two numeric values.
The logic is implemented in MainActivity.kt using event listeners and conditional operations.

Problem Statement

Manual calculation of arithmetic operations can be time-consuming and error-prone.
This project aims to develop a simple Android-based calculator that performs basic mathematical operations efficiently with proper input validation and error handling.

Objectives

To develop a basic Android application using Kotlin

To implement arithmetic operations using button click events

To validate user input and handle runtime errors

To understand Android UI components such as EditText, Button, and TextView

Features

Addition of two numbers

Subtraction of two numbers

Multiplication of two numbers

Division of two numbers

Validation for empty input fields

Division-by-zero error handling

Simple and user-friendly interface

Technologies Used

Programming Language: Kotlin

Framework: Android SDK

IDE: Android Studio

UI Design: XML Layouts

Application Workflow

User enters two numeric values in the input fields

User selects an arithmetic operation by clicking a button

The application processes the input values

The calculated result is displayed on the screen

Error messages are shown for invalid or missing inputs

Code Overview

MainActivity.kt:

Handles UI interaction and logic

Uses setOnClickListener for button actions

Implements a reusable calculate() function

activity_main.xml:

Defines the user interface layout

Sample Code Snippet
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
        "/" -> if (b == 0.0) "Cannot divide by zero" else (a / b).toString()
        else -> "Invalid Operation"
    }
}

Project Structure
MyFirstApp/
│
├── app/
│   ├── src/main/java/com/example/myfirstapp/MainActivity.kt
│   ├── src/main/res/layout/activity_main.xml
│
└── README.md

How to Run the Application

Install Android Studio

Open the project in Android Studio

Connect an Android device or start an emulator

Build and run the application

Limitations

Supports only basic arithmetic operations

No history of calculations

Simple UI without advanced design elements

Future Enhancements

Add support for decimal formatting

Implement calculation history

Improve UI using Material Design

Add scientific calculator features

Author

Vignesh Sakthivel

License

This project is developed for educational purposes and is free to use and modify.
