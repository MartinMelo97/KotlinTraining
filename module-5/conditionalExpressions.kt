package conditionals

fun main() {
    val mode: Int = 2
    val result = when (mode) { // When expression
        1 -> "The mode is lazy."
        2 -> {
            "The mode is 2."
            "So the mode is busy."
        }
        3 -> "The mode is super-productive."
        else -> "Idk that mode."
    }
    println(result)

    val x = if (mode < 2) { // If expression
        "Mode is less than 2."
    } else { // Always use else
        42
    }

    println(x)
}