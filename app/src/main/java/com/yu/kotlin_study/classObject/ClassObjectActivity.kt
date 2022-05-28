package com.yu.kotlin_study.classObject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.yu.kotlin_study.R
import com.yu.kotlin_study.classObject.constructor.Student
import com.yu.kotlin_study.classObject.data.DataTest
import com.yu.kotlin_study.classObject.inter.StudyImp
import com.yu.kotlin_study.classObject.sing.Singleton

class ClassObjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_object)


        var bt1 = findViewById<Button>(R.id.bt1);

        bt1.setOnClickListener {

            //Kotlin 中实例化对象和 Java 类似，但是把 new 关键字给去掉了
            val class1 = Class1()
            class1.name = "小明"
            class1.age = 12

            class1.log()
        }

        findViewById<Button>(R.id.bt2).setOnClickListener {

            //构造器
            val student1 = Student()
            student1.log()
            val student2 = Student("sin1")
            student2.log()
            val student3 = Student("sin2", 33)
            student3.log()
        }

        findViewById<Button>(R.id.bt3).setOnClickListener {

            //接口
            val study = StudyImp("name", 22)
            study.fun1()
            study.fun2()
        }
        findViewById<Button>(R.id.bt4).setOnClickListener {

            //数据类
            val data = DataTest("datName", 22)

            Log.d("data", data.name)
            Log.d("data", data.age.toString())
            Log.d("data", data.toString())
        }
        findViewById<Button>(R.id.bt5).setOnClickListener {

            //单例类
            val sing = Singleton

            sing.singletonLog()
        }
    }
}