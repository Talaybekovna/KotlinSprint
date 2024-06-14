package org.example.lesson_5

const val FIRST_NUMBER = 3
const val SECOND_NUMBER = 7
const val CORRECT_ANSWER = FIRST_NUMBER + SECOND_NUMBER
fun main() {
    println("Для входа в приложение решите пример: ${FIRST_NUMBER + SECOND_NUMBER} = ?")
    val answer = readln().toInt()

    if (answer == CORRECT_ANSWER) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}