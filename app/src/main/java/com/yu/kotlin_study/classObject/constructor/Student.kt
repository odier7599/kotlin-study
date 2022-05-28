package com.yu.kotlin_study.classObject.constructor

import android.util.Log
import com.yu.kotlin_study.classObject.Class1

/**
 * 1）、主构造函数的特点是没有函数体，直接跟在类名的后面即可，如果需要在主构造函数里面做逻辑，复写 init 函数即可

2）、主构造函数中声明成 val 或者 var 的参数将自动成为该类的字段，如果不加，那么该字段的作用域仅限定在主构造函数中

3）、次构造函数是通过 constructor 关键字来定义的

4）、当一个类没有显示的定义主构造函数，但是定义了次构造函数时，那么被继承的类后面不需要加 ()
 */
class Student(var sin: String, var grade: Int) : Class1() {

    init {
       name = sin
        age = grade
    }

    constructor(sin: String):this(sin,10){


    }

    constructor():this("李四",12){

    }
    fun logStudent(){
        Log.d("Student", "$name , $age")
    }


}