package com.example.demo.FizzBuzz

class JavaRule : IFizzBuzz {
    override fun say(): String {
        return "Java"
    }

    private fun `เท่ากับเจ็ด`(input: Int) = input == 7

    override fun isValid(input: Int): Boolean {
        return `เท่ากับเจ็ด`(input)

    }
}