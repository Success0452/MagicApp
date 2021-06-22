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

                    Toast.makeText(this, "$test7", Toast.LENGTH_LONG).show()

                    if (result == 0 && lastElement == 0){
                        binding.Anwser.text = "Magic Number"

                    }else{
                        binding.Anwser.text = "Not a Magic number"
                    }

                }else if (inputLength == 3){
                    val element1 = input.elementAt(0)
                    val element2 = input.elementAt(1)

                    
                    val result = element1.toString().toInt() % 1
                    val result2 = element2.toString().toInt() % 2

                    if (result == 0 && lastElement == 0 && result2 == 0){
                        binding.Anwser.text = "$inputVariable" + R.string.yes
                    }else{
                        binding.Anwser.text = "$inputVariable" + R.string.no
                    }
                }else if (inputLength == 4)
                {
                    val element1 = input.elementAt(0)
                    val element2 = input.elementAt(1)
                    val element3 = input.elementAt(2)

                    val result = element1.toString().toInt() % 1
                    val result2 = element2.toString().toInt() % 2
                    val result3 = element3.toString().toInt() % 3

                    if (result == 0 && lastElement == 0 && result2 == 0 && result3 == 0){
                        binding.Anwser.text = "$inputVariable" + R.string.yes
                    }else{
                        binding.Anwser.text = "$inputVariable" + R.string.no
                    }

                }else if (inputLength == 5) {
                    val element1 = input.elementAt(0)
                    val element2 = input.elementAt(1)
                    val element3 = input.elementAt(2)
                    val element4 = input.elementAt(3)

                    val result = element1.toString().toInt() % 1
                    val result2 = element2.toString().toInt() % 2
                    val result3 = element3.toString().toInt() % 3
                    val result4 = element4.toString().toInt() % 4

                    if (result == 0 && lastElement == 0 &&
                            result2 == 0 && result3 == 0 && result4 == 0){
                        binding.Anwser.text = "$inputVariable is a magic number"
                    }else{
                        binding.Anwser.text = "$inputVariable is not  a magic number"
                    }
                }else if (inputLength == 6) {
                    val element1 = input.elementAt(0)
                    val element2 = input.elementAt(1)
                    val element3 = input.elementAt(2)
                    val element4 = input.elementAt(3)
                    val element5 = input.elementAt(4)

                    val result = element1.toInt() / inputLength
                    val result2 = element2.toInt() / inputLength
                    val result3 = element3.toInt() / inputLength
                    val result4 = element4.toInt() / inputLength
                    val result5 = element5.toInt() / inputLength

                    if (result.compareTo(result) == 0 || lastElement.compareTo(lastElement) == 0 || result2.compareTo(result2) == 0 ||
                            result3.compareTo(result3) == 0 || result4.compareTo(result4) == 0 || result5.compareTo(result5) == 0){
                        binding.Anwser.text = "$inputVariable" + R.string.yes
                    }else{
                        binding.Anwser.text = "$inputVariable" + R.string.no
                    }
                }else if (inputLength == 7){
                    val element1 = input.elementAt(0)
                    val element2 = input.elementAt(1)
                    val element3 = input.elementAt(2)
                    val element4 = input.elementAt(3)
                    val element5 = input.elementAt(4)
                    val element6 = input.elementAt(5)

                    val result = element1.toInt() / inputLength
                    val result2 = element2.toInt() / inputLength
                    val result3 = element3.toInt() / inputLength
                    val result4 = element4.toInt() / inputLength
                    val result5 = element5.toInt() / inputLength
                    val result6 = element6.toInt() / inputLength

                    if (result.compareTo(result) == 0 || lastElement.compareTo(lastElement) == 0 || result2.compareTo(result2) == 0 ||
                            result3.compareTo(result3) == 0 || result4.compareTo(result4) == 0 || result5.compareTo(result5) == 0 || result6.compareTo(result6) == 0){
                        binding.Anwser.text = "$inputVariable" + R.string.yes
                    }else{
                        binding.Anwser.text = "$inputVariable" + R.string.no
                    }
                }else if (inputLength == 8){
                    val element1 = input.elementAt(0)
                    val element2 = input.elementAt(1)
                    val element3 = input.elementAt(2)
                    val element4 = input.elementAt(3)
                    val element5 = input.elementAt(4)
                    val element6 = input.elementAt(5)
                    val element7 = input.elementAt(6)

                    val result = element1.toInt() / inputLength
                    val result2 = element2.toInt() / inputLength
                    val result3 = element3.toInt() / inputLength
                    val result4 = element4.toInt() / inputLength
                    val result5 = element5.toInt() / inputLength
                    val result6 = element6.toInt() / inputLength
                    val result7 = element7.toInt() / inputLength

                    if (result.compareTo(result) == 0 || lastElement.compareTo(lastElement) == 0 || result2.compareTo(result2) == 0 ||
                            result3.compareTo(result3) == 0 || result4.compareTo(result4) == 0 || result5.compareTo(result5) == 0 || result6.compareTo(result6) == 0 ||
                            result7.compareTo(result7) == 0){
                        binding.Anwser.text = "$inputVariable" + R.string.yes
                    }else{
                        binding.Anwser.text = "$inputVariable" + R.string.no
                    }
                }else if (inputLength == 9) {
                    val element1 = input.elementAt(0)
                    val element2 = input.elementAt(1)
                    val element3 = input.elementAt(2)
                    val element4 = input.elementAt(3)
                    val element5 = input.elementAt(4)
                    val element6 = input.elementAt(5)
                    val element7 = input.elementAt(6)
                    val element8 = input.elementAt(7)

                    val result = element1.toInt() / inputLength
                    val result2 = element2.toInt() / inputLength
                    val result3 = element3.toInt() / inputLength
                    val result4 = element4.toInt() / inputLength
                    val result5 = element5.toInt() / inputLength
                    val result6 = element6.toInt() / inputLength
                    val result7 = element7.toInt() / inputLength
                    val result8 = element8.toInt() / inputLength

                    if (result.compareTo(result) == 0 || lastElement.compareTo(lastElement) == 0 || result2.compareTo(result2) == 0 ||
                            result3.compareTo(result3) == 0 || result4.compareTo(result4) == 0 || result5.compareTo(result5) == 0 || result6.compareTo(result6) == 0 ||
                            result7.compareTo(result7) == 0 || result8.compareTo(result8) == 0){
                        binding.Anwser.text = "$inputVariable" + R.string.yes
                    }else{
                        binding.Anwser.text = "$inputVariable" + R.string.no
                    }
                }

            }
        }


    }

    private fun el(ele: Any) {

    }


}


