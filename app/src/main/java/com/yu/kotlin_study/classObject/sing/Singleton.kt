package com.yu.kotlin_study.classObject.sing

import android.util.Log

/**
 * Kotlin 中，我们只需要使用 object 关键字去替换 class 关键字就可以去定义一个单例类了
 *
 * 调用单例类中的方法也比较简单，直接使用类名 . 上方法就可以了，类似于 Java 中的静态方法调用方式
 */
object Singleton {

    fun singletonLog(){
        Log.d("Singleton", "singletonLog")
    }

}