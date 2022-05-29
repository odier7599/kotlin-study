package com.yu.kotlin_study.lazy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.yu.kotlin_study.R
import com.yu.kotlin_study.classObject.constructor.Student


/**
 * 对变量延迟初始化
1）、使用 lateinit 关键字对一个变量延迟初始化

使用 lateinit 关键字注意事项：

1、只能作用于 var 属性，且该属性没有自定义 get 和 set 方法

2、该属性必须是非空类型，且不能是原生类型

2）、当你对一个变量使用了 lateinit 关键字，Kotlin 编译器就不会在去检查这个变量是否会为空了，此时你要确保它在被调用之前已经初始化了，否则程序运行的时候会报错，可以使用 ::object.isInitialized 这种固定的语法结构判断变量是否已经初始化

3）、使用 by lazy 对一个变量延迟初始化

使用 by lazy 注意事项：

1、只能作用于 val 属性
 */
class LazyActivity : AppCompatActivity() {

    private val TAG = "LazyActivity";

    /**
     * 只能作用于 var 属性，且该属性没有自定义 get 和 set 方法
     * 该属性必须是非空类型，且不能是原生类型
     */
    lateinit var name: String

    val age :Int by lazy {
        20
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lazy)

        findViewById<Button>(R.id.bt1).setOnClickListener {

            name = "延迟初始化name"
            Log.d(TAG, name)
            Log.d(TAG, "延迟初始化age : $age")
        }
    }
}