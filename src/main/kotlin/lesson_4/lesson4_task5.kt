package org.example.lesson_4

const val HAS_DAMAGES = false
const val MIN_CREW_COUNT = 55
const val MAX_CREW_COUNT = 70
const val MIN_BOXES_OF_FOOD = 50
const val IS_WEATHER_GOOD = true
fun main() {
    println("наличие повреждений корпуса:")
    val hasDamages = readln().toBoolean()

    println("текущий состав экипажа:")
    val crewCount = readln().toInt()

    println("количество ящиков с провизией на борту:")
    val boxesOfFood = readln().toInt()

    println("благоприятность метеоусловий:")
    val isWeatherGood = readln().toBoolean()

    val result = (hasDamages == HAS_DAMAGES) && (crewCount in MIN_CREW_COUNT..MAX_CREW_COUNT) &&
            (boxesOfFood > MIN_BOXES_OF_FOOD) && (isWeatherGood == IS_WEATHER_GOOD || isWeatherGood != IS_WEATHER_GOOD) ||
            (hasDamages != HAS_DAMAGES) && (crewCount == MAX_CREW_COUNT) &&
            (boxesOfFood >= MIN_BOXES_OF_FOOD) && (isWeatherGood == IS_WEATHER_GOOD)
    println(result)
}