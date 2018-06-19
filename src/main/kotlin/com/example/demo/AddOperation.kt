package com.example.demo

import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class AddOperation {
    fun calculate(operand1: Int, operand2: Int): Double {
        return (operand1 + operand2).toDouble()
    }
}
