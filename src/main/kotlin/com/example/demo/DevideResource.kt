package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class DevideResource {
    @GetMapping("/div/{i1}/{i2}")
    fun dev(@PathVariable i1: Number,
            @PathVariable i2: Number): String {
        val result = DivideOperation().calculate(i1.toDouble(), i2.toDouble())
        return result.format(2)
    }
}