package com.example.kotlintest

fun main() {
    val hello1 = "helloWorld1"
    var hello2: String = "helloWorld2"

    println(hello1)
    println(hello2)
    println(hello())
}

fun hello(): String {
    return "hello func"
}