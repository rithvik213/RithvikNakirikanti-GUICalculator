package com.example.guicalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //array to hold the numbers being inputed
        var numbersInputted:ArrayList<Double> = ArrayList()

        //array to hold the operations being inputed
        //1 = Add
        //2 = Subtract
        //3 = Multiply
        //4 = Divide
        //5 = Sqrt
        var operations:ArrayList<Int> = ArrayList()

        //map buttons 0-9 first
        val button0: Button = findViewById(R.id.button0)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)

        //maps operations buttons
        val plusButton: Button = findViewById(R.id.buttonPlus)
        val multiplyButton: Button = findViewById(R.id.buttonMultiplication)
        val subtractButton: Button = findViewById(R.id.buttonSubtract)
        val divideButton: Button = findViewById(R.id.buttonDivide)
        val sqrtButton: Button = findViewById(R.id.buttonSqrt)
        val equalsButton: Button = findViewById(R.id.buttonEqual)
        val periodButton: Button = findViewById(R.id.buttonPeriod)

        //Edit Text
        val resultView:EditText = findViewById(R.id.resultView)

        //clear button
        val clearButton:Button = findViewById(R.id.buttonClear)

        //on click listeners for each button 0-9
        button0.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "0"
            resultView.setText(newText)
        }

        button1.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "1"
            resultView.setText(newText)
        }

        button2.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "2"
            resultView.setText(newText)
        }

        button3.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "3"
            resultView.setText(newText)
        }

        button4.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "4"
            resultView.setText(newText)
        }

        button5.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "5"
            resultView.setText(newText)
        }

        button6.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "6"
            resultView.setText(newText)
        }

        button7.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "7"
            resultView.setText(newText)
        }

        button8.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "8"
            resultView.setText(newText)
        }

        button9.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "9"
            resultView.setText(newText)
        }

        periodButton.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()

            var newText = currentText + "."
            resultView.setText(newText)
        }

        //clear button
        clearButton.setOnClickListener { view: View ->
            resultView.setText("")
            operations.clear()
        }

        //operations buttons
        plusButton.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()

            // check if the last character wasn't one of the operations
            if (currentText.last() == '+' || currentText.last() == '-' ||
                currentText.last() == '*' || currentText.last() == '/') {
            }

            else {
                //add the "+" button to screen
                var newText = currentText + "+"
                resultView.setText(newText)

                //add this operation to operations array
                operations.add(1)
            }
        }

        subtractButton.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()

            // check if the last character wasn't one of the operations
            if (currentText.last() == '+' || currentText.last() == '-' ||
                currentText.last() == '*' || currentText.last() == '/') {
            }
            else {
                //add the "+" button to screen
                var newText = currentText + "-"
                resultView.setText(newText)

                //add this operation to operations array
                operations.add(2)
            }
        }

        multiplyButton.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()

            // check if the last character wasn't one of the operations
            if (currentText.last() == '+' || currentText.last() == '-' ||
                currentText.last() == '*' || currentText.last() == '/') {
            }
            else {
                //add the "+" button to screen
                var newText = currentText + "*"
                resultView.setText(newText)

                //add this operation to operations array
                operations.add(3)
            }
        }

        divideButton.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()

            // check if the last character wasn't one of the operations
            if (currentText.last() == '+' || currentText.last() == '-' ||
                currentText.last() == '*' || currentText.last() == '/') {
            }
            else {
                //add the "+" button to screen
                var newText = currentText + "\\"
                resultView.setText(newText)

                //add this operation to operations array
                operations.add(4)
            }
        }

        equalsButton.setOnClickListener { view: View ->

            //look at current string on screen
            var currentText = resultView.text.toString()

            var result: Double = 0.0

            //special case for sqrt
            if(operations[0] == 5) {

                //get the numbers from the Text
                val numbers = currentText.split(Regex("√"))

                Log.d("CALC", numbers[1])

                //check if number is negative
                if (numbers[1].toDouble() < 0) {
                    result = Math.PI
                }
                else {
                    result = sqrt(numbers[1].toDouble())
                }

            }
            else {
                //get the numbers from the Text
                val numbers = currentText.split(Regex("[+\\-*/√\\\\]"))

                //variable to hold result
                result = numbers[0].toDouble()

                for(i in 1 until numbers.size) {
                    when(operations[i-1]) {
                        1 -> result += numbers[i].toDouble()
                        2 -> result -= numbers[i].toDouble()
                        3 -> result *= numbers[i].toDouble()
                        4 -> {
                            val divisor = numbers[i].toDouble()
                            if (divisor == 0.0) {
                                // Handle the error, for example, return NaN
                                result = Double.NaN
                                break // Exit the loop or handle the error accordingly
                            } else {
                                result /= divisor
                            }
                        }
                        5 -> result = sqrt(result)
                    }
                }

            }
            //special print for errors
            if(result == Math.PI) {
                var errorMessageNegSqrt = "SqrtNegErr"

                resultView.setText(errorMessageNegSqrt)
            } else if(result.isNaN()) {
                var errorMessageDivideByZero = "DivZeroErr"

                resultView.setText(errorMessageDivideByZero)
            }
            else {
                //display result to the user
                resultView.setText(result.toString())

            }
            //clear the entire operations list and restart
            operations.clear()
        }

        sqrtButton.setOnClickListener { view: View ->

            //look at current string on screen
            var currentText = resultView.text.toString()

            //get the numbers from the Text
            val numbers = currentText.split(Regex("[+\\-*/√\\\\]"))

            //variable to hold result
            var result: Double = numbers[0].toDouble()

            for(i in 1 until numbers.size) {
                when(operations[i-1]) {
                    1 -> result += numbers[i].toDouble()
                    2 -> result -= numbers[i].toDouble()
                    3 -> result *= numbers[i].toDouble()
                    4 -> {
                        val divisor = numbers[i].toDouble()
                        if (divisor == 0.0) {
                            // Handle the error, return NaN
                            result = Double.NaN
                            break
                        } else {
                            result /= divisor
                        }
                    }
                }
            }

            if (result.isNaN()) {
                var finalResponse = "DivZeroErr"
                resultView.setText(finalResponse)
            }
            else {
                //display sqrt operation to user
                var finalResponse = "√" + result.toString()
                resultView.setText(finalResponse)

            }

            //clear the operations array since sqrt already did it
            operations.clear()
            operations.add(5)
        }















    }
}