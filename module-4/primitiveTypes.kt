val string = "Kotling" // Double quotes
val concatenation = "Hello" + " Kotlin"
val boolean = 3 < 4 // true
val boolean2 = 3 > 4 // false
val byte: Byte = 4 // range -128 | 127
val short: Short = 24
val i = 7 // Default is integer :Int
val l: Long = 12324325454
val l2 = 3L // Other way to use long type
val d = 3.73 // Default is double :Double
val f: Float = 3.73f // Convert to float
val d2: Double = 3.1415 // Convert to double
val c: Char = 'a' // Single quotes

// Switch types
var f2: Float = 3.4f
var d3: Double = 0.0
d3 = f2 // Not possible because are different types
d3 = f2.toDouble() // Convert float to double
// .toInt()
// .toDouble()
// .toString()
// ...etc