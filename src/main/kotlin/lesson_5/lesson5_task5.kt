package org.example.lesson_5

const val ONE = 1
const val TWO = 2
const val THREE = 3
fun main() {
    val randomNumbers: ArrayList<Int> = arrayListOf()
    val numbers: ArrayList<Int> = arrayListOf()

    val firstRandomNumber = (0..42).random()
    val secondRandomNumber = (0..42).random()
    val thirdRandomNumber = (0..42).random()

    randomNumbers.add(firstRandomNumber)
    randomNumbers.add(secondRandomNumber)
    randomNumbers.add(thirdRandomNumber)

    println("Введите три числа от 0 до 42:")
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    val thirdNumber = readln().toInt()

    numbers.add(firstNumber)
    numbers.add(secondNumber)
    numbers.add(thirdNumber)

    val guessedNumbersSize = numbers.intersect(randomNumbers.toSet()).size

    when (guessedNumbersSize) {
        THREE -> {
            println("Вы угадали все числа и выиграли джекпот!")
        }
        TWO -> {
            println("Вы угадали два числа и получаете крупный приз!")
        }
        ONE -> {
            println("Вы угадали одно число и выиграли утешительный приз!")
        }
        else -> {
            println("Вы не угадали ни одного числа.")
        }
    }

    println("Правильные числа: ${randomNumbers[0]}, ${randomNumbers[1]}, ${randomNumbers[2]}")
}