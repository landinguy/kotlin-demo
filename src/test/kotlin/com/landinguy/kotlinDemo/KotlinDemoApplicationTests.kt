package com.landinguy.kotlinDemo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class KotlinDemoApplicationTests {

    @Test
    fun contextLoads() {
    }


    @Test
    fun test() {
        val list = listOf("java", "kotlin", "groovy", "python", "c")
        list.stream().forEach(System.out::println)
    }
}
