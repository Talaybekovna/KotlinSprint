package org.example.lesson_2

fun main() {
    val crystals: Int = 7
    val ironOres: Int = 11
    val baff = 0.2

    val baffForCrystals = (crystals * baff).toInt()
    val baffForIronOres = (ironOres * baff).toInt()

    println("baffForCrystals: $baffForCrystals")
    println("baffForIronOres: $baffForIronOres")
}