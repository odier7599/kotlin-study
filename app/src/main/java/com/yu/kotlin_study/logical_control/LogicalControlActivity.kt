package com.yu.kotlin_study.logical_control

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.yu.kotlin_study.R

/**
 * 程序的逻辑控制
 */
class LogicalControlActivity : AppCompatActivity() {

    val TAG: String = "LogicalControlActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logical_control)

        initOnClick()
    }

    fun initOnClick() {
        val bt1 = findViewById<Button>(R.id.bt1);
        bt1.setOnClickListener {
            Log.d(TAG, testIf(1, 2).toString())
            Log.d(TAG, testIf2(1, 2).toString())
            Log.d(TAG, testWhen("11").toString())

        }
        val bt2 = findViewById<Button>(R.id.bt2);
        bt2.setOnClickListener {
            Log.d(TAG, testWhen("11").toString())
            Log.d(TAG, testWhen2("11").toString())
        }

        val bt3 = findViewById<Button>(R.id.bt3);
        bt3.setOnClickListener {
            for1()
            for2()
            for3()
            for4()
        }
    }

    /**
     * 每一个条件中的最后一行代码作为返回值
     */
    fun testIf(number1: Int, number2: Int): Int {
        return if (number1 > number2) {
            number1
        } else {
            number2
        }
    }

    /**
     * 简化版
     *
     * 每一个条件中的最后一行代码作为返回值,
     */
    fun testIf2(number1: Int, number2: Int): Int = if (number1 > number2) number1 else number2

    /**
     * 有参数
     */
    fun testWhen(name: String) = when (name) {
        "11" -> 11
        "22" -> 22
        "33" -> 33
        else -> 0
    }

    /**
     * when 中无参数的情况
     */
    fun testWhen2(name: String) = when {
        name == "11" -> 11
        name == "22" -> 22
        name == "33" -> 33
        else -> 0
    }

    /**
     *  … 表示创建两端都是闭区间的升序区间
     */
    fun for1() {
        Log.d(TAG, "for1")
        for (i in 0..10) {
            Log.d(TAG, "$i")
        }
    }

    /**
     *  until 表示创建左端是闭区间右端是开区间的升序区间
     */
    fun for2() {
        Log.d(TAG, "for2")
        for (i in 0 until 10) {
            Log.d(TAG, "$i")
        }
    }

    /**
     *  downTo 表示创建两端都是闭区间的降序区间
     */
    fun for3() {
        Log.d(TAG, "for3")
        for (i in 10 downTo 0) {
            Log.d(TAG, "$i")
        }
    }

    /**
     * downTo 表示创建两端都是闭区间的降序区间,每次在跳过3个元素
     */
    fun for4() {
        Log.d(TAG, "for4")
        for (i in 10 downTo 0 step 3) {
            Log.d(TAG, "$i")
        }
    }
}