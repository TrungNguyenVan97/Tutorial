package com.example.kotlinapplication.learning
import java.lang.Exception

fun main() {
    try {
        println(math())
    } catch (e: Exception) {
        println(e)
    }

}

@Throws
fun math(): Int {
    var a = 5
    var b = 0
    return a / b
}







