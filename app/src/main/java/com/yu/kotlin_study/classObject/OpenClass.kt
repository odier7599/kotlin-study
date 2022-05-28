package com.yu.kotlin_study.classObject

import android.util.Log

/**
 * Kotlin 中规定，如果要声明一个非抽象类可继承，必须加上 open 关键字，否则不可继承，
 * 这点和 Java 中不同，Java 中的类默认是可被继承的，
 * Effective Java 这本书中提到：如果一个类不是专门为继承而设计的，那么就应该主动将它加上 final 声明，禁止他可以被继承
 */
open class OpenClass {

    var name = "";
    var age = 0;

    fun log() {

        Log.d("Class1", "$name , $age")
    }


}