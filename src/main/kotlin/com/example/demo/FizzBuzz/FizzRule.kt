package com.example.demo.FizzBuzz

class FizzRule : IFizzBuzz {
    override fun say(): String {
        return "Fizz"

    }

    override fun isValid(input: Int): Boolean {
        return `หารสามลงตัว`(input)
    }

    private fun `หารสามลงตัว`(input: Int) = input % 3 == 0
}