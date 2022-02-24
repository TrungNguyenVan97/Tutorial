package com.example.kotlinapplication.learning

fun main() {
    var list = mutableListOf(3, 5, 6)
    val result = list.fold(3) { t: Int, i: Int ->
        t + i
    }
    print(result)
}



