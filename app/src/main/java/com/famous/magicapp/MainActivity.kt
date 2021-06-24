package com.famous.magicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.famous.magicapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.determineBtn.setOnClickListener{

            val input = binding.inputBox.text.toString()

            //check the length of the input number
            if (input.length > 9 || input.length < 2) {
                binding.inputBox.error = "input a double figure and not > than 9 figure"
                binding.inputBox.requestFocus()
                return@setOnClickListener

                //if it meet the requirement then proceed to this step
            }else{

                val inputVariable = input.toInt()
                val inputLength = input.length
                val test7 = (inputLength - 1)
                val lastElement = inputVariable % inputLength


                if (inputLength == 2) {
                    val element1 = input.elementAt(0)
                    val result = element1.toString().toInt() % 1

                    if (result == 0 && lastElement == 0){
                        binding.Anwser.text = "Magic Number"

                    }else{
                        binding.Anwser.text = "Not a Magic number"
                    }

                }else if (inputLength == 3){
                    val element1 = input.elementAt(0).toString().toInt()
                    val element2 = input.elementAt(1).toString().toInt()
                    val elementB = element1 + element2

                    val result = element1 % 1
                    val result2 = elementB % 2



                    if (result == 0 && lastElement == 0 &&  result2 == 0){
                        binding.Anwser.text = "Magic Number"
                    }else{
                        binding.Anwser.text = "Not a Magic number"
                    }
                }else if (inputLength == 4)
                {
                    val element1 = input.elementAt(0).toString().toInt()
                    val element2 = input.elementAt(1).toString().toInt()
                    val element3 = input.elementAt(2).toString().toInt()

                    val elementB = element1 + element2
                    val elementC = elementB + element3

                    val result = element1 % 1
                    val result2 = elementB % 2
                    val result3 = elementC % 3

                    if (result == 0 && lastElement == 0 && result2 == 0 && result3 == 0){
                        binding.Anwser.text = "Magic Number"
                    }else{
                        binding.Anwser.text = "Not a Magic number"
                    }

                }else if (inputLength == 5) {
                    val element1 = input.elementAt(0).toString().toInt()
                    val element2 = input.elementAt(1).toString().toInt()
                    val element3 = input.elementAt(2).toString().toInt()
                    val element4 = input.elementAt(3).toString().toInt()

                    val elementB = element1 + element2
                    val elementC = elementB + element3
                    val elementD = elementC + element4

                    val result = element1 % 1
                    val result2 = elementB % 2
                    val result3 = elementC % 3
                    val result4 = elementD % 4

                    if (result == 0 && lastElement == 0 &&
                            result2 == 0 && result3 == 0 && result4 == 0){
                        binding.Anwser.text = "Magic Number"
                    }else{
                        binding.Anwser.text = "Is Not a Magic Number"
                    }
                }else if (inputLength == 6) {
                    val element1 = input.elementAt(0).toString().toInt()
                    val element2 = input.elementAt(1).toString().toInt()
                    val element3 = input.elementAt(2).toString().toInt()
                    val element4 = input.elementAt(3).toString().toInt()
                    val element5 = input.elementAt(4).toString().toInt()

                    val elementB = element1 + element2
                    val elementC = elementB + element3
                    val elementD = elementC + element4
                    val elementE = elementD + element5

                    val result = element1 % 1
                    val result2 = elementB % 2
                    val result3 = elementC % 3
                    val result4 = elementD % 4
                    val result5 = elementE % 5

                    if (result == 0 && lastElement == 0 && result2 == 0 &&
                            result3 == 0 && result4 == 0 && result5 == 0){
                        binding.Anwser.text = "Magic Number"
                    }else{
                        binding.Anwser.text = "Is Not a Magic Number"
                    }
                }else if (inputLength == 7){
                    val element1 = input.elementAt(0).toString().toInt()
                    val element2 = input.elementAt(1).toString().toInt()
                    val element3 = input.elementAt(2).toString().toInt()
                    val element4 = input.elementAt(3).toString().toInt()
                    val element5 = input.elementAt(4).toString().toInt()
                    val element6 = input.elementAt(5).toString().toInt()

                    val elementB = element1 + element2
                    val elementC = elementB + element3
                    val elementD = elementC + element4
                    val elementE = elementD + element5
                    val elementF = elementE + element6

                    val result = element1 % 1
                    val result2 = elementB % 2
                    val result3 = elementC % 3
                    val result4 = elementD % 4
                    val result5 = elementE % 5
                    val result6 = elementF % 6

                    if (result == 0 && lastElement == 0 && result2 == 0 &&
                            result3 == 0 && result4 == 0 && result5 == 0 && result6 == 0){
                        binding.Anwser.text = "Magic Number"
                    }else{
                        binding.Anwser.text = "Is Not a Magic Number"
                    }
                }else if (inputLength == 8){
                    val element1 = input.elementAt(0).toString().toInt()
                    val element2 = input.elementAt(1).toString().toInt()
                    val element3 = input.elementAt(2).toString().toInt()
                    val element4 = input.elementAt(3).toString().toInt()
                    val element5 = input.elementAt(4).toString().toInt()
                    val element6 = input.elementAt(5).toString().toInt()
                    val element7 = input.elementAt(6).toString().toInt()

                    val elementB = element1 + element2
                    val elementC = elementB + element3
                    val elementD = elementC + element4
                    val elementE = elementD + element5
                    val elementF = elementE + element6
                    val elementG = elementF + element7

                    val result = element1 % 1
                    val result2 = elementB % 2
                    val result3 = elementC % 3
                    val result4 = elementD % 4
                    val result5 = elementE % 5
                    val result6 = elementF % 6
                    val result7 = elementG % 7

                    if (result == 0 && lastElement == 0 && result2 == 0 &&
                            result3 == 0 && result4 == 0 && result5 == 0 && result6 == 0 &&
                            result7 == 0){
                        binding.Anwser.text = "Magic Number"
                    }else{
                        binding.Anwser.text = "Is Not a Magic Number"
                    }
                }else if (inputLength == 9) {
                    val element1 = input.elementAt(0).toString().toInt()
                    val element2 = input.elementAt(1).toString().toInt()
                    val element3 = input.elementAt(2).toString().toInt()
                    val element4 = input.elementAt(3).toString().toInt()
                    val element5 = input.elementAt(4).toString().toInt()
                    val element6 = input.elementAt(5).toString().toInt()
                    val element7 = input.elementAt(6).toString().toInt()
                    val element8 = input.elementAt(7).toString().toInt()

                    val elementB = element1 + element2
                    val elementC = elementB + element3
                    val elementD = elementC + element4
                    val elementE = elementD + element5
                    val elementF = elementE + element6
                    val elementG = elementF + element7
                    val elementH = elementG + element8

                    val result = element1 / 1
                    val result2 = elementB / 2
                    val result3 = elementC / 3
                    val result4 = elementD / 4
                    val result5 = elementE / 5
                    val result6 = elementF / 6
                    val result7 = elementG / 7
                    val result8 = elementH / 8

                    if (result == 0 && lastElement == 0 && result2 == 0 &&
                            result3 == 0 && result4 == 0 && result5 == 0 && result6 == 0 &&
                            result7 == 0 && result8 == 0){
                        binding.Anwser.text = "Magic Number"
                    }else{
                        binding.Anwser.text = "Is Not a Magic Number"
                    }
                }

            }
        }
    }
}

