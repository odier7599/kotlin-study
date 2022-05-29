package com.yu.kotlin_study.sealedClass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.yu.kotlin_study.R

sealed class Result
class Success : Result()
class Failure : Result()

class SealedActivity : AppCompatActivity() {

    private val TAG = "SealedActivity";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sealed)

        findViewById<Button>(R.id.bt1).setOnClickListener {
            Log.d(TAG, getResultMsg(Success()))


        }
    }

    fun getResultMsg(result: Result) = when(result){
        is Success -> "Success"
        is Failure  -> "Failure"
    }
}