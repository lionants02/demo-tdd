package com.example.demo.FizzBuzz

class BuzzRule : IFizzBuzz {

    override fun say(): String {

        return "Buzz"
    }

    override fun isValid(input: Int): Boolean {
        return `หารห้าลงตัว`(input)
    }

    private fun `หารห้าลงตัว`(input: Int) = input % 5 == 0
}