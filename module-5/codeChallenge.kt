package conditionals

import java.util.*


fun main() {
    val random = Random().nextInt(50) + 1
    val range = when (random) {
        in 1..10 -> "Value into range 1 to 10."
        in 11..20 -> "Value into range 11 to 20."
        in 21..30 -> "Value into range 21 to 30."
        in 31..40 -> "Value into range 21 to 40."
        else -> "Value is above 40."
    }
    println(range)
    println("Value: $random")
}