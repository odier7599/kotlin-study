package com.yu.kotlin_study

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.yu.kotlin_study.classObject.ClassObjectActivity
import com.yu.kotlin_study.databinding.ActivityMainBinding
import com.yu.kotlin_study.function.FunctionActivity
import com.yu.kotlin_study.lambda.LambdaActivity
import com.yu.kotlin_study.logical_control.LogicalControlActivity
import com.yu.kotlin_study.nullPointer.NullPointerActivity
import com.yu.kotlin_study.util.joinToStr
import com.yu.kotlin_study.variables_and_functions.VariablesAndFunctionsActivity


/**
 * 主页面用于跳转其他功能页
 */
class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity";

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initOnClick()
    }

    /**
     * 设置监听
     */
    fun initOnClick() {
        binding.bt1.setOnClickListener {
            Log.d(TAG, "bt1 OnClick   变量 函数")
            val intent = Intent(this, VariablesAndFunctionsActivity::class.java)
            startActivity(intent)
        }

        binding.bt2.setOnClickListener {
            Log.d(TAG, "bt2 OnClick  fi when while")
            val intent = Intent(this, LogicalControlActivity::class.java)
            startActivity(intent)
        }

        binding.bt3.setOnClickListener {
            Log.d(TAG, "bt3 OnClick  面向对象")
            val intent = Intent(this, ClassObjectActivity::class.java)
            startActivity(intent)
        }

        binding.bt4.setOnClickListener {
            Log.d(TAG, "bt4 OnClick  Lambda")
            val intent = Intent(this, LambdaActivity::class.java)
            startActivity(intent)
        }

        binding.bt5.setOnClickListener {
            Log.d(TAG, "bt5 OnClick  Null pointer")
            val intent = Intent(this, NullPointerActivity::class.java)
            startActivity(intent)
        }
        binding.bt6.setOnClickListener {
            Log.d(TAG, "bt6 OnClick  标准函数和静态方法")
            val intent = Intent(this, FunctionActivity::class.java)
            startActivity(intent)
        }
    }
}