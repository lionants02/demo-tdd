package com.example.demo.FizzBuzz

class FizzBuss {
    fun say(input: Int): String {

        val rules = arrayListOf<IFizzBuzz>()
        rules.add(FizzRule())
        rules.add(BuzzRule())
        rules.add(JavaRule())

        var output = ""
        rules.forEach {
            if (it.isValid(input))
                output += it.say()
        }

        return if (output.isEmpty()) "$input" else output
    }
}