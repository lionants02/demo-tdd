package com.example.demo

class FizzBuss {
    fun say(input: Int): String {

        val output = (
                if (`หารสามลงตัว`(input)) "Fizz" else "") + (
                if (`หารห้าลงตัว`(input)) "Buzz" else "")

        return if (output.isEmpty()) "$input" else output
    }

    private fun `หารห้าลงตัว`(input: Int) = input % 5 == 0

    private fun `หารสามลงตัว`(input: Int) = input % 3 == 0
}