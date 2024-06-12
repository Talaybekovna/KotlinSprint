package org.example.lesson_2

fun main() {
    val totalStudents = 4

    val studentOnePoints = 3
    val studentTwoPoints = 4
    val studentThreePoints = 3
    val studentFourPoints = 5

    val pointsAverage = (studentOnePoints + studentTwoPoints + studentThreePoints + studentFourPoints) / totalStudents.toDouble()
    println(String.format("%.2f", pointsAverage))
}