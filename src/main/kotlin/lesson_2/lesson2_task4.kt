package org.example.lesson_2

const val BAFF = 0.2
fun main() {
    val crystals = 7
    val ironOres = 11

    val baffForCrystals = (crystals * BAFF).toInt()
    val baffForIronOres = (ironOres * BAFF).toInt()

    println("baffForCrystals: $baffForCrystals")
    println("baffForIronOres: $baffForIronOres")
}