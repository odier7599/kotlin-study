package com.yu.kotlin_study.constant

/**
 * 常量类
 *
 */
class Constant {

    companion object {
        /**
         * 属性必须满足以下条件才能成为const属性：

        必须是顶级对象，或者是对象的成员，或者是伴随对象的成员
        必须使用String类型或原始类型进行初始化
        没有自定义获取器
        因此，您不能将const变量分配给函数或某些类，因为在这种情况下，变量将在运行时而不是在编译时进行初始化。
         */
        const val  CONSTANT = "This is a constant"

        const val companyName = "MindOrks" // this will work
        val comapanyname = "MindOrks" // this will work
/*
        const val companyName = getCompanyName() // will not work
        val companyName = getCompanyName() // this will work*/

    }

    val comapanyname = "MindOrks"
}