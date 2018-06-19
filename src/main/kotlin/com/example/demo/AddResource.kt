package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class AddResource {

    @GetMapping("/add/{i1}/{i2}")
    fun add(@PathVariable i1: Number,
            @PathVariable i2: Number): String {
        val result = AddOperation().calculate(i1.toInt(), i2.toInt())

        return result.toString()
    }
}