package com.example

/**
 * Simple calculator class for testing Branch Rulesets
 */
class Calculator {
    fun add(a: Int, b: Int): Int = a + b

    fun subtract(a: Int, b: Int): Int = a - b

    fun multiply(a: Int, b: Int): Int = a * b

    fun divide(a: Int, b: Int): Int {
        if (b == 0) {
            throw IllegalArgumentException("Cannot divide by zero")
        }
        return a / b
    }

    fun isEven(number: Int): Boolean = number % 2 == 0

    fun isPrime(number: Int): Boolean {
        if (number < 2) return false
        if (number == 2) return true
        if (number % 2 == 0) return false

        for (i in 3..Math.sqrt(number.toDouble()).toInt() step 2) {
            if (number % i == 0) return false
        }
        return true
    }
}
