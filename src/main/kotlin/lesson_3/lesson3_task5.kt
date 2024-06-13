package org.example.lesson_3

fun main() {
    val response = "D2-D4;0"

    val responseList = response.split("-", ";")

    println("""
        ${responseList[0]}
        ${responseList[1]}
        ${responseList[2]}
    """.trimIndent())
}