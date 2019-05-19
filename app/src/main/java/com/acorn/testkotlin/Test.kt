package com.acorn.testkotlin

import com.acorn.testkotlin.utils.joinString
import com.acorn.testkotlin.utils.joinString2
import com.acorn.testkotlin.utils.log

fun main(args: Array<String>) {
    log(joinString(arrayListOf(0,2,3,5)))
    log(joinString(listOf("1233","数字","啊","!"),prefix = "[",postfix = "]"),"不是默认值")
    log(listOf("这个是","扩展函数","可以直接","在List后调用").joinString2(".",postfix = ")"))
}