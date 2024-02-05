package com.example.guicalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

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

        //on click listeners for each button 0-9
        button0.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "0"
            resultView.setText(newText)

            //add number user inputted to arraylist holding values for calculation
            //numbersInputted.add(currentText.toDouble())
        }

        button1.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "1"
            resultView.setText(newText)

            //add number user inputted to arraylist holding values for calculation
            //numbersInputted.add(currentText.toDouble())
        }

        button2.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "2"
            resultView.setText(newText)

            //add number user inputted to arraylist holding values for calculation
            //numbersInputted.add(currentText.toDouble())
        }

        button3.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "3"
            resultView.setText(newText)

            //add number user inputted to arraylist holding values for calculation
            //numbersInputted.add(currentText.toDouble())
        }

        button4.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "4"
            resultView.setText(newText)

            //add number user inputted to arraylist holding values for calculation
            //numbersInputted.add(currentText.toDouble())
        }

        button5.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "5"
            resultView.setText(newText)

            //add number user inputted to arraylist holding values for calculation
            //numbersInputted.add(currentText.toDouble())
        }

        button6.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "6"
            resultView.setText(newText)

            //add number user inputted to arraylist holding values for calculation
            //numbersInputted.add(currentText.toDouble())
        }

        button7.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "7"
            resultView.setText(newText)

            //add number user inputted to arraylist holding values for calculation
            //numbersInputted.add(currentText.toDouble())
        }

        button8.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "8"
            resultView.setText(newText)

            //add number user inputted to arraylist holding values for calculation
            //numbersInputted.add(currentText.toDouble())
        }

        button9.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()
            var newText = currentText + "9"
            resultView.setText(newText)

            //add number user inputted to arraylist holding values for calculation
            //numbersInputted.add(currentText.toDouble())
        }

        periodButton.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()

            //check if there is already a decimal point
            var checkDecimal: Boolean = false
            for(x in currentText) {
                if(x == '.') {
                    checkDecimal = true
                    break
                }
            }
            if(checkDecimal == false) {
                var newText = currentText + "."
                resultView.setText(newText)
            }

        }

        //operations buttons
        plusButton.setOnClickListener { view: View ->

            //get current text
            var currentText = resultView.text.toString()

            //add the "+" button to screen
            var newText = currentText + "+"
            resultView.setText(newText)

            //add this operation to operations array
            operations.add(1)
        }

        subtractButton.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()

            //add the "+" button to screen
            var newText = currentText + "-"
            resultView.setText(newText)

            //add this operation to operations array
            operations.add(2)
        }

        multiplyButton.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()

            //add the "+" button to screen
            var newText = currentText + "*"
            resultView.setText(newText)

            //add this operation to operations array
            operations.add(3)
        }

        divideButton.setOnClickListener { view: View ->
            //get current text
            var currentText = resultView.text.toString()

            //add the "+" button to screen
            var newText = currentText + "\\"
            resultView.setText(newText)

            //add this operation to operations array
            operations.add(4)
        }

        equalsButton.setOnClickListener { view: View ->

            //look at current string on screen
            var currentText = resultView.text.toString()

            //get the numbers from the Text
            val numbers = currentText.split(Regex("[+\\-*/\\\\]"))

            //variable to hold result
            var result: Double = numbers[0].toDouble()

            for(i in 1 until numbers.size) {
                when(operations[i-1]) {
                    1 -> result += numbers[i].toDouble()
                    2 -> result -= numbers[i].toDouble()
                    3 -> result *= numbers[i].toDouble()
                    4 -> result /= numbers[i].toDouble()
                }
            }

            //display result to the user
            resultView.setText(result.toString())

            //clear the entire operations list and restart
            operations.clear()






        }















    }
}