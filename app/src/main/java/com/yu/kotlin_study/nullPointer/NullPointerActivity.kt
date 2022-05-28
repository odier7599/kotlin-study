package com.yu.kotlin_study.nullPointer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.yu.kotlin_study.R
import com.yu.kotlin_study.classObject.inter.Study
import com.yu.kotlin_study.classObject.inter.StudyImp

/**
 *1）、在类型后面加上 ? ，表示可空类型，Kotlin 默认所有的参数和变量不可为空

2）、在对象调用的时候，使用 ?. 操作符，它表示如果当前对象不为空则调用，为空则什么都不做

3）、?: 操作符表示如果左边的结果不为空，返回左边的结果，否则返回右边的结果

4）、在对象后面加 !! 操作符表示告诉Kotlin我这里一定不会为空,你不用进行检测了，如果为空，则抛出空指针异常

5）、let 函数，提供函数式 Api，并把当前调用的对象当作参数传递到 Lambda 表达式中
 *
 */
class NullPointerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_pointer)

        initClick()
    }

    private fun initClick() {

        findViewById<Button>(R.id.bt1).setOnClickListener {
            doStudy(StudyImp("name", 22))
        }
    }

    private fun doStudy(study: Study?) {
        study?.let {
            it.fun1()
            it.fun2()
        }
    }
}