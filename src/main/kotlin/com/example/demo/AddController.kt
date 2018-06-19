package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class AddController {


    @Autowired
    private var operation: AddOperation? = null

    @GetMapping("/add/{i1}/{i2}")
    fun add(@PathVariable i1: Number,
            @PathVariable i2: Number): String {
        val result = operation!!.calculate(i1.toInt(), i2.toInt())

        return result.toString()
    }

    fun setAddOperation(addOperation: AddOperation?) {
        this.operation = addOperation
    }


}