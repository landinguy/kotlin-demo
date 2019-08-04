package com.landinguy.kotlinDemo

import com.landinguy.kotlinDemo.`class`.Person
import com.landinguy.kotlinDemo.pojo.User
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.io.File
import java.lang.Thread.currentThread
import kotlin.Boolean as Boolean1

@RunWith(SpringRunner::class)
@SpringBootTest
class KotlinDemoApplicationTests {

    @Test
    fun contextLoads() {
    }


    @Test
    fun test() {
//        val list = listOf("java", "kotlin", "groovy", "python", "c")
//        list.stream().forEach(System.out::println)

//        val user = User("jack", 18, "man")
//        val (name, age, sex) = user//解构语法
//        println(name)
//        println(age)
//        println(sex)
//        println(user)

//        val sum = fun(a: Int, b: Int) = a + b//匿名函数

//        val sumf = fun(a: Int, b: Int) = { a + b }//高阶函数

//        println(sum(1, 4))

//        println(sumf(1, 4)())
//        println(sumf(1, 4).invoke())

//        println(Person.name)
//        println(Person.age)
//        println(Person.getInfo())

//        val map = mapOf("name" to "landing guy", "age" to 24, "job" to "java engineer")
//        println(map)


//        val l1 = listOf("a", "b", "c")
//        val l2 = l1.map { listOf(it + 1, it + 2, it + 3) }
//        val l3 = l2.flatten()//平铺:将多层嵌套的list平铺成一层list
//        println(l2)
//        println(l3)

//        val l4 = l1.flatMap { listOf(it + 1, it + 2, it + 3) }
//        println(l4)

        //遍历文件夹下的所有文件
//        val file = File("C:\\Users\\landing guy\\Downloads")
//        val fileTreeWalk = file.walk()
//        fileTreeWalk.iterator().forEach { println(it.name) }

        //线程
//        object : Thread() {
//            override fun run() {
//                sleep(1000)
//                println("使用object 对象表达式创建线程：${currentThread()}")
//            }
//        }.start()

//        val t1 = Thread {
//            Thread.sleep(1000)
//            println("使用lambda表达式 创建线程：${currentThread()}")
//        }
//        t1.start()


//        Thread.sleep(3000)
//        println("end")

        //引用对象实例方法
        val c = Calculate()
        println(c.sum(1, 2))
        println(c.sum(3, 2))

        val sum = c::sum//上面c.sum()重复出现，有点啰嗦，可将sum方法提取出来
        println(sum(3, 2))
        println(sum(3, 3))

    }

    class Calculate {
        fun sum(a: Int, b: Int) = a + b
    }

}
