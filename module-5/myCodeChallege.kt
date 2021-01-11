// 1. Generate two random numbers in the range of 0 to 10
// 2. Print both values
// 2. Validate if both numbers are greater than 0, if not, show a message saying that both numbers needs to be even
// 3. Sum the two numbers
// 4. Using when get the month's name of the value,
// 5. If the value is bigger than 12, show "Not month available"

package conditionals

import java.util.*


fun main() {
    val num1 = Random().nextInt(10)
    val num2 = Random().nextInt(10)
    println("Num1: $num1")
    println("Num2: $num2")
    if (num1 <= 0 || num2 <= 0) {
        println("Both numbers needs to be greater than 0")
    } else {
        val sum = num1 + num2
        val monthName = when (sum) {
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "Dicember"
            else -> "Not month available"
        }
        println("Month name: $monthName")
    }
}