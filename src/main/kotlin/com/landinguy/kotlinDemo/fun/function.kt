package com.landinguy.kotlinDemo.`fun`

/**
 * @author landing guy
 * @date 2019/8/4
 */

fun main(args: Array<String>) {
    val list = listOf("a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg")
    //将list中长度为奇数的字符串过滤出来

//    println(list.filter(h(f, l)))

//    println(list.filter { f(l(it)) })

//    println(getOdd(list))

    println(list.filter { (it.length) % 2 == 1 })

}


val f = fun(x: Int) = x % 2 == 1//判断入参是否奇数
val l = fun(s: String) = s.length//返回字符串长度

typealias F = (Int) -> Boolean
typealias L = (String) -> Int
typealias H = (String) -> Boolean

val h = fun(f: F, l: L): H = { f(l(it)) }//高阶函数,入参为两个函数，返回一个函数
val getOdd = fun(list: List<String>): List<String> = list.filter(h(f, l))//返回值类型可省略

