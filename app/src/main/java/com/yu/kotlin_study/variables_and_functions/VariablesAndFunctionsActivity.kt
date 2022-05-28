package com.yu.kotlin_study.variables_and_functions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.yu.kotlin_study.R
import com.yu.kotlin_study.util.joinToStr
import kotlin.math.max

/**
 * 变量和函数
 */
class VariablesAndFunctionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_variables_and_functions)

        var bt1 = findViewById<Button>(R.id.bt1);

        bt1.setOnClickListener {

            //测试顶层函数
            Log.d("测试顶层函数", joinToStr(collection = listOf("123", "456")))

            method1("1")
            method2("2")
            method3("3")
            method4(1, 2)
        }
    }


    /*------------函数定义--------------*/
    // 函数 == java中方法，申明使用fun
    //无返回值
    fun method1(param1: String) {

    }

    //无返回值
    fun method2(param1: String): Unit {

    }

    //有返回值
    fun method3(param1: String): Int {
        return 0
    }

    //函数方法体只有一行代码时，可省略方法体，中间用 = 连接即可
    fun method4(number1: Int, number2: Int): Int = max(number1, number2)

    /*------------函数定义--------------*/
}