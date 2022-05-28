package com.yu.kotlin_study.classObject.inter

import android.util.Log

class StudyImp(name: String, age: Int) : People(name, age), Study {

    override fun fun1() {
        Log.d("Student im Study", "fun1 $name  , $age")
    }

}