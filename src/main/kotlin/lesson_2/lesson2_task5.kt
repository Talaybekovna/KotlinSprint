package org.example.lesson_2

import kotlin.math.pow

const val PERCENT = 100
fun main() {
    val deposit = 70_000
    val percentage = 16.7
    val term = 20

    val result = deposit * (1 + percentage / PERCENT).pow(term)
    val totalDeposit = String.format("%.3f", result)
    println(totalDeposit)
}