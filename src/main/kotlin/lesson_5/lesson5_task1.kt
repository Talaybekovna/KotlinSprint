package org.example.lesson_5


fun main() {
    val firstNumber = 3
    val secondNumber = 7
    val correctAnswer = firstNumber + secondNumber

    println("Для входа в приложение решите пример: $firstNumber + $secondNumber = ?")
    val answer = readln().toInt()

    if (answer == correctAnswer) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}