package com.landinguy.kotlinDemo.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author landing guy
 * @date 2019/8/3
 */
@RestController
class HelloController {

    @RequestMapping("hello")
    fun hello(): String {
        return "hello,kotlin"
    }
}

