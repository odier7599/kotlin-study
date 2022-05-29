package com.yu.kotlin_study.staticFun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.yu.kotlin_study.R
import com.yu.kotlin_study.util.joinToStr

/**
 * Kotlin 中没有直接提供定义为静态方法的关键字，但是提供了一些类似的语法特性来支持静态方法调用的写法

1）、使用 companion object 为一个类创建一个伴生类，然后调用这个伴生类的方法，这个方法不叫静态方法，但是可以当作静态方法调用

2）、使用 object 关键字定义一个单例类，通过单例类，去调用方法，这种方法也不叫静态方法，但是可以当作静态方法调用

3）、如果想定义真正的静态方法，Kotlin 中也提供了两种方式：1、使用 @JvmStatic 注解，且注解只能加在伴生类和单例类上的方法上面 2、定义顶层方法

4）、顶层方法就是不定义在任何类中的方法，顶层方法在任何位置都能被调用到，Kotlin 编译器会把所有的顶层方法编译成静态方法

5）、如果在 Java 中调用顶层方法，Java 默认是没有顶层方法的概念的，Kotlin 编译器会生成一个我们定义这个文件的 Java 类，例如我在 Kotlin 中的 Util.kt 文件中定义了一个顶层方法，那么就会生成一个 UtilKt 的 Java 类供在 Java 中调用

6）、在 Kotlin 中比较常用的是 单例，伴生类和顶层方法，@JvmStatic 注解用的比较少
 */
class StaticActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static)

        initClick()
    }

    private fun initClick() {

        findViewById<Button>(R.id.bt1).setOnClickListener {
            Util.doAction()
            Util2.doAction()
            Util3.doAction()
            doAction()

        }

    }

}

/**
 * 情况1：使用 companion object 为一个类创建一个伴生类
 */
class Util {
    companion object {
        fun doAction() {
            Log.d("StaticActivity", "使用 companion object 为一个类创建一个伴生类")
        }
    }
}

/**
 * 使用 object 关键字定义一个单例类
 */
object Util2{
    fun doAction() {
        Log.d("StaticActivity", "使用 object 关键字定义一个单例类")
    }
}

/**
 * 使用 1、使用 @JvmStatic 注解
 */
object Util3{
    @JvmStatic
    fun doAction() {
        Log.d("StaticActivity", "使用 1、使用 @JvmStatic 注解 ")
    }
}