package com.first.davidapplication

import java.lang.StringBuilder

class demo {
}

fun main() {
    val list = listOf("apple", "banana", "orange", "pear", "grape")
    val result = StringBuilder().apply{
        append("Starting eating furits.\n")
        for (furit in list){
            append(furit).append("\n")
        }
        append("eat all")
    }
    println(result.toString())
}