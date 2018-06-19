package com.example.demo

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.web.client.TestRestTemplate


@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AddControllerTest {


    @Autowired
    private val rest: TestRestTemplate? = null

    @Test
    fun _1_add_1_should_be_2() {
        val result = rest!!.getForObject("/add/1/1", String::class.java)
        println("Result = $result")
        Assert.assertEquals("2.0", result)

    }

}
