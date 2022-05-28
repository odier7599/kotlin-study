package com.yu.kotlin_study.classObject

import android.util.Log

/**
 * 当我们在类中创建属性的时候，Kotlin 会自动帮我们创建 get 和 set 方法
 *
 * 一般在类中，我们会用 var 关键字去定义一个属性，因为属性一般是可变的，如果你确定某个属性不需要改变，则用 val
 */
open class Class1 {

    var name = "";
    var age = 0;

    fun log() {

        Log.d("Class1", "$name , $age")
    }

}