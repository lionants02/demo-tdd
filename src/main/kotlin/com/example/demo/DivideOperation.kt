package com.example.demo

class DivideOperation {
    fun calculate(operation1: Double, operation2: Double): Double {
        if (operation2 == 0.0) {
            throw DevideOperationException()
        }
        return operation1 / operation2
    }

}