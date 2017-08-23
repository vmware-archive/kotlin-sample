package io.pivotal.pal.kotlinsample


val positiveNumbers = listOf(-1, -2, 3, 6, 1).filter { it > 0 }

val squares = (1..10).map { it * it }

fun print() {
    println("Positive Numbers:")
    positiveNumbers.forEach { println(it) }

    println("Squares")
    println(squares.joinToString(","))
}
