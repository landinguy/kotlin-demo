package com.landinguy.kotlinDemo.`class`

/**
 * @author landing guy
 * @date 2019/8/3
 */
/*** object单例对象，可通过类名直接调用属性和方法 ***/
object Person {
    val name: String = "perter"
    val age: Int = 18

    fun getInfo(): String {
        return "name#$name,age#$age"
    }
}