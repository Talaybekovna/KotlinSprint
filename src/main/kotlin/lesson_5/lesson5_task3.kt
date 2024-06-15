package org.example.lesson_5

const val FIRST_NUMBER = 15
const val SECOND_NUMBER = 37
fun main() {
    println("Введите два числа:")
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()

    if (firstNumber == FIRST_NUMBER || firstNumber == SECOND_NUMBER &&
        secondNumber == FIRST_NUMBER || secondNumber == SECOND_NUMBER) {
        println("Поздравляем! Вы выиграли главный приз!")
    }
    else if (firstNumber == FIRST_NUMBER || firstNumber == SECOND_NUMBER ||
        secondNumber == FIRST_NUMBER || secondNumber == SECOND_NUMBER) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Правильные числа: $FIRST_NUMBER и $SECOND_NUMBER")
}