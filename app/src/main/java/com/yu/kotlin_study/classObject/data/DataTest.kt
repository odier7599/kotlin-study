package com.yu.kotlin_study.classObject.data

/**
 *
 * 在 Kotlin 中，我们只需要使用 data 关键字去修饰一个类，Kotlin 就会自动帮我们生成 Java 需要重写的那些方法
 */
data class DataTest(val name: String, val age: Int)
