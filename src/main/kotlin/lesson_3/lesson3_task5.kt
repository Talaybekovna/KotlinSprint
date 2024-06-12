package org.example.lesson_3

fun main() {
    val stepFrom: String
    val stepTo: String
    val stepNumber: Int
    val response = "D2-D4;0"

    stepFrom = response.substring(0, 2)
    stepTo = response.substring(3, 5)
    stepNumber = response.substring(6).toInt()
    println("""
        $stepFrom
        $stepTo
        $stepNumber
    """.trimIndent())
}