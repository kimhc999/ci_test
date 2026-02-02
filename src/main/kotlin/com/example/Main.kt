package com.example

fun main() {
    val calculator = Calculator()

    println("Calculator Demo")
    println("===============")
    println("5 + 3 = ${calculator.add(5, 3)}")
    println("5 - 3 = ${calculator.subtract(5, 3)}")
    println("5 * 3 = ${calculator.multiply(5, 3)}")
    println("15 / 3 = ${calculator.divide(15, 3)}")
    println("Is 4 even? ${calculator.isEven(4)}")
    println("Is 7 prime? ${calculator.isPrime(7)}")
}
