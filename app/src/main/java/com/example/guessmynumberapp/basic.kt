package com.example.guessmynumberapp

import java.util.*
import kotlin.jvm.JvmStatic

internal object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val operator: Char
        val number1: Double
        val number2: Double
        val result: Double

        // create an object of Scanner class
        val input = Scanner(System.`in`)

        // ask users to enter operator
        println("Choose an operator: +, -, *, or /")
        operator = input.next()[0]

        // ask users to enter numbers
        println("Enter first number")
        number1 = input.nextDouble()
        println("Enter second number")
        number2 = input.nextDouble()
        when (operator) {
            '+' -> {
                result = number1 + number2
                println("$number1 + $number2 = $result")
            }
            '-' -> {
                result = number1 - number2
                println("$number1 - $number2 = $result")
            }
            '*' -> {
                result = number1 * number2
                println("$number1 * $number2 = $result")
            }
            '/' -> {
                result = number1 / number2
                println("$number1 / $number2 = $result")
            }
            else -> println("Invalid operator!")
        }
        input.close()
    }
}