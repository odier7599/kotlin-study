package com.yu.kotlin_study.classObject.inter

import android.util.Log

/**
 * 定义接口中的一系列的抽象行为 Kotlin 中增加了接口中定义的函数可以有默认实现，
 * 其实 Java 在 JDK1.8 之后也开始支持这个功能
 */
interface Study {

    fun fun1()

    fun  fun2(){

        Log.d("Study", "fun2")
    }


}