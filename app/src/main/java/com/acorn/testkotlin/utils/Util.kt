package com.acorn.testkotlin.utils

fun log(logText: String, tag: String = "TAG") {
    println("$tag $logText")
}

fun <T> joinString(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "{",
    postfix: String = "}"
): String {
    val sb = StringBuilder(prefix)
    for ((index: Int, content: T) in collection.withIndex()) {
        if (index != 0) {
            sb.append(separator)
        }
        sb.append(content.toString())
    }
    sb.append(postfix)
    return sb.toString()
}

fun <T> Collection<T>.joinString2(separator :String =",",prefix: String ="{",postfix: String="}"): String{
    val sb= StringBuilder(prefix)
    for((index,element) in this.withIndex()) {
        if (index > 0) sb.append(separator)
        sb.append(element)
    }
    sb.append(postfix)
    return sb.toString()
}
