package org.example.lesson_5

const val AGE_OF_MAJORITY = 18
const val PRESENT_YEAR = 2024
fun main() {
    println("Введите год вашего рождения:")
    val userBornYear = readln().toInt()

    val userAge = PRESENT_YEAR - userBornYear

    if (userAge >= AGE_OF_MAJORITY)  println("Показать экран со скрытым контентом")
}