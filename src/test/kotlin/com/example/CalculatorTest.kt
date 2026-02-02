package com.example

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.assertThrows

class CalculatorTest {
    private val calculator = Calculator()

    @Test
    @DisplayName("Addition should work correctly")
    fun testAdd() {
        assertEquals(8, calculator.add(5, 3))
        assertEquals(3, calculator.add(-2, 5))
        assertEquals(-8, calculator.add(-5, -3))
    }

    @Test
    @DisplayName("Subtraction should work correctly")
    fun testSubtract() {
        assertEquals(0, calculator.subtract(2, 3))
        assertEquals(-10, calculator.subtract(-5, 5))
        assertEquals(0, calculator.subtract(-5, -5))
    }

    @Test
    @DisplayName("Multiplication should work correctly")
    fun testMultiply() {
        assertEquals(15, calculator.multiply(5, 3))
        assertEquals(-25, calculator.multiply(-5, 5))
        assertEquals(15, calculator.multiply(-5, -3))
        assertEquals(0, calculator.multiply(0, 5))
    }

    @Test
    @DisplayName("Division should work correctly")
    fun testDivide() {
        assertEquals(5, calculator.divide(15, 3))
        assertEquals(-5, calculator.divide(-15, 3))
        assertEquals(5, calculator.divide(-15, -3))
    }

    @Test
    @DisplayName("Division by zero should throw exception")
    fun testDivideByZero() {
        val exception = assertThrows<IllegalArgumentException> {
            calculator.divide(10, 0)
        }
        assertEquals("Cannot divide by zero", exception.message)
    }

    @Test
    @DisplayName("Even number detection should work correctly")
    fun testIsEven() {
        assertTrue(calculator.isEven(4))
        assertTrue(calculator.isEven(0))
        assertTrue(calculator.isEven(-2))
        assertFalse(calculator.isEven(3))
        assertFalse(calculator.isEven(-1))
    }

    @Test
    @DisplayName("Prime number detection should work correctly")
    fun testIsPrime() {
        assertTrue(calculator.isPrime(2))
        assertTrue(calculator.isPrime(3))
        assertTrue(calculator.isPrime(5))
        assertTrue(calculator.isPrime(7))
        assertTrue(calculator.isPrime(11))
        assertTrue(calculator.isPrime(13))

        assertFalse(calculator.isPrime(0))
        assertFalse(calculator.isPrime(1))
        assertFalse(calculator.isPrime(4))
        assertFalse(calculator.isPrime(6))
        assertFalse(calculator.isPrime(9))
        assertFalse(calculator.isPrime(-5))
    }

    @Test
    @DisplayName("Large prime number should be detected correctly")
    fun testLargePrime() {
        assertTrue(calculator.isPrime(97))
        assertFalse(calculator.isPrime(100))
    }
}
