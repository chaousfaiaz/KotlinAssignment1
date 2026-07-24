fun main() {
    // Pass the desired number to the functions below
    val number = 8

    // Call the sumsOfNumbers function with the provided number and print the result
    val sumResult = sumsOfNumbers(number)
    println("The sum of numbers from 1 to $number is $sumResult")

    // Call the factorialCalculation function with the provided number and print the result
    val factorialIterativeResult = factorialCalculation(number)
    println("The factorial of $number is $factorialIterativeResult")

    // Call the factorialLambda function with the provided number and print the result
    val factorialLambdaResult = factorialLambda(number)
    println("The factorial of $number using Lambda method is $factorialLambdaResult")

    // Call the factorialRecursive function with the provided number and print the result
    val factorialRecursiveResult = factorialRecursive(number)
    println("The factorial of $number using recursive method is $factorialRecursiveResult")
}

// Function to calculate the sum of integers from 1 up to the specified number
fun sumsOfNumbers(number: Int): Int {
    var sum = 0

    // Loop through numbers from 1 to the specified number and calculate their sum
    for (i in 1..number) {
        sum += i
    }

    // Return the calculated sum
    return sum
}

// Iterative function to calculate the factorial of a specified number
fun factorialCalculation(number: Int): Long {
    var result: Long = 1

    // Loop through numbers from 1 to the specified number and calculate the factorial
    for (i in 1..number) {
        result *= i
    }

    // Return the calculated factorial
    return result
}

// Lambda function to calculate the factorial of a specified number
val factorialLambda: (Int) -> Long = { number ->
    var result: Long = 1

    // Loop through numbers from 1 to the specified number and calculate the factorial
    for (i in 1..number) {
        result *= i
    }

    // Return the calculated factorial
    result
}

// Recursive function to calculate the factorial of a specified number
fun factorialRecursive(number: Int): Long {
    // Base case: if the number is less than or equal to 1, return 1
    return if (number <= 1) {
        1
    } else {
        // Recursively call the function to multiply the number by the factorial of the number - 1
        number * factorialRecursive(number - 1)
    }
}
