package com.yu.kotlin_study.lambda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.yu.kotlin_study.R

class LambdaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lambda)

        initClick()
    }

    private fun initClick() {

        findViewById<Button>(R.id.bt1).setOnClickListener {

            //不可变集合
            val list = listOf("str1", "str2", "str3", "str4", "str5")
            Log.d("不可变集合", list.toString())
        }

        findViewById<Button>(R.id.bt2).setOnClickListener {

            //可变集合
            val list = mutableListOf("str1", "str2", "str3", "str4", "str5")
            Log.d("可变集合", list.toString())

            list.add("addStr")
            Log.d("可变集合  添加了一个元素", list.toString())
        }

        findViewById<Button>(R.id.bt3).setOnClickListener {

            //不可变集合
            val set = setOf("str1", "str2", "str3", "str4", "str5")
            Log.d("不可变集合", set.toString())

        }

        findViewById<Button>(R.id.bt4).setOnClickListener {

            //可变集合
            val list = mutableSetOf("str1", "str2", "str3", "str4", "str5")
            Log.d("可变集合", list.toString())

            list.add("addStr")
            Log.d("可变集合  添加了一个元素", list.toString())
        }
        findViewById<Button>(R.id.bt5).setOnClickListener {

            //不变集合
            val map = mapOf(
                "str1" to "value1", "str2" to "value2",
                "str3" to "value3", "str4" to "value4", "str5" to "value5"
            )
            Log.d("不可变集合", map.toString())

        }

        findViewById<Button>(R.id.bt6).setOnClickListener {

            //可变集合
            val map = mutableMapOf(
                "str1" to "value1", "str2" to "value2",
                "str3" to "value3", "str4" to "value4", "str5" to "value5"
            )

            map.put("str6", "value6")
            Log.d("可变集合  添加了一个元素", map.toString())
        }

        findViewById<Button>(R.id.bt7).setOnClickListener {


            //可变集合
            val list = mutableListOf("str1", "str2", "str3", "str4", "str5","str66")
            Log.d("可变集合", list.toString())

            val  maxlength = list.maxByOrNull {
                it.length
            }

            Log.d("maxlength ", maxlength.toString())
        }
    }
}