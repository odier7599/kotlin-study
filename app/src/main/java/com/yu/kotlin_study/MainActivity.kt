package com.yu.kotlin_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.yu.kotlin_study.databinding.ActivityMainBinding


/**
 * 主页面用于跳转其他功能页
 */
class MainActivity : AppCompatActivity() {

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
        binding.bt1.setOnClickListener { Log.d("MainActivity", "bt1 OnClick") }
    }
}