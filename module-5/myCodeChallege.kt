// 1. Generate two random numbers in the range of 0 to 10
// 2. Print both values
// 2. Validate if both numbers are greater than 0, if not, show a message saying that both numbers needs to be even
// 3. Sum the two numbers
// 4. Using when get the month's name of the value,
// 5. If the value is bigger than 12, show "Not month available"

import java.util.*


fun main() {
    val num1 = Random().nextInt(10)
    val num2 = Random().nextInt(10)
    val months = listOf(
        "January", "February", "March", "April",
        "May", "June", "July", "August", "September",
        "October", "November", "December"
    )
    println("Num1: $num1")
    println("Num2: $num2")
    if (num1 <= 0 || num2 <= 0) {
        println("Both numbers needs to be greater than 0")
    } else {
        val sum = num1 + num2
        val monthName = when (sum) {
            in 1..13 -> months[sum - 1]
            else -> "Not month available"
        }
        println("Month name: $monthName")
    }
}