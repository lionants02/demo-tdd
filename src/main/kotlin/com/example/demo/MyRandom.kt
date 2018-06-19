package com.example.demo

import java.util.*

class MyRandom(val random: IRandom) {
    fun generate(): Int {
        return random.getNumber()

    }
}