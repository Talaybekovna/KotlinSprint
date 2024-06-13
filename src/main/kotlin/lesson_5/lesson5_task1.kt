package org.example.lesson_5

const val CORRECT_ANSWER = 10
fun main() {
    println("Для входа в приложение решите пример: 3 + 7 = ?")
    val answer = readln().toInt()

    if (answer == CORRECT_ANSWER) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}