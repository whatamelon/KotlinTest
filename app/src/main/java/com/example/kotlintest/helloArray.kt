package com.example.kotlintest

fun main() {
    var arr1 = listOf("1","2")
    var arr2 = mutableListOf("1","2")
    arr2.add("3")
    println(arr2)

    for(i in 1..10 step 3) {
        println(i)
    }

    for((index, item) in arr1.withIndex()){
        println("$index + $item")
    }

    var hello: Any = "hello1"
    if(hello is String) {
        var str: String = hello
        println(str)
    }

}