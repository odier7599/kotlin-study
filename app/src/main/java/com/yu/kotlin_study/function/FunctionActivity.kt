package com.yu.kotlin_study.function

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.yu.kotlin_study.R
import com.yu.kotlin_study.classObject.inter.Study
import com.yu.kotlin_study.classObject.inter.StudyImp
import java.lang.StringBuilder

class FunctionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function)

        initClick()
    }

    private fun initClick() {

        findViewById<Button>(R.id.bt1).setOnClickListener {
            let(StudyImp("name", 22))
        }

        findViewById<Button>(R.id.bt2).setOnClickListener {
            also(StudyImp("name", 22))
        }

        findViewById<Button>(R.id.bt3).setOnClickListener {
            with()
        }

        findViewById<Button>(R.id.bt4).setOnClickListener {
            run()
        }

        findViewById<Button>(R.id.bt5).setOnClickListener {
            apply()
        }
    }

    /**
     *  let 函数，必须让某个对象调用，接收一个 Lambda 表达式参数，Lambda 表达式中的参数为当前调用者，且最后一行代码作为返回值
     *
     */
    private fun let(study: Study?) {
        Log.d("data", study?.let {
            it.fun1()
            it.fun2()
            "let 返回值"
        }.toString())
    }


    /**
     *  also 函数，必须让某个对象调用，接收一个 Lambda 表达式参数，Lambda 表达式中的参数为当前调用者，无法指定返回值，这个函数返回的是当前调用对象本身
     *
     */
    private fun also(study: Study?) {
        Log.d("also  ", "also 没有返回值，此处是它的调用对象" + study?.also {
            it.fun1()
            it.fun2()
        })
    }

    /**
     *  with 函数，接收两个参数，第一个为任意类型参数，第二个为 Lambda 表达式参数，Lambda 表达式中拥有第一个参数的上下文 this ，且最后一行代码作为返回值
     *
     */
    private fun with() {
        val name = "name"
        val age = 20
        val returnValue = with(StringBuilder()) {
            append(name).append(" ").append(age)
        }
        Log.d("with", returnValue.toString())
    }

    /**
     *  run 函数，必须让某个对象调用，接收一个 Lambda 表达式参数，Lambda 表达式中拥有当前调用对象的上下文 this ，且最后一行代码作为返回值
     *
     */
    private fun run() {
        var returnValue = run() {
            "run returnValue"
        }
        Log.d("run", returnValue.toString())
    }

    /**
     *  apply 函数，必须让某个对象调用，接收一个 Lambda 表达式参数，Lambda 表达式中拥有当前调用对象的上下文 this ，无法指定返回值，这个函数返回的是当前调用对象本身
     *
     */
    private fun apply() {
        val returnValue = StringBuilder().apply {
            append("apply").append("apply")
        }
        Log.d("apply", returnValue.toString())
    }
}