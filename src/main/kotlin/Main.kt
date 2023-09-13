fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")

    val byte: Byte = 127 // 8 bit
    val short: Short = 128 // 16 bit
    val integer = 0 // 32 bit
    val long = 0L // 64 bit
    val float = 0f // 32 bit
    val double = 0.0 // 64 bit

    val char = 'a'
    val string = "abc"

    val boolean = false

    val value = "a" // immutable (tidak dapat diassign lebih dari 1x)
    var variable = "abc" // mutable (bisa diassign lebih dari 1x)

    println("integer max: ${Byte.MAX_VALUE} min ${Int.MIN_VALUE}")
    println("float max: ${Float.MAX_VALUE} min: ${Int.MIN_VALUE} bits: ${Float.SIZE_BITS}")
    println("double max: ${Double.MAX_VALUE} min: ${Double.MIN_VALUE} bits: ${Double.SIZE_BITS}")

    variable = "def"
    val stringKe0: Char = variable.get(0)

    val arrayOfChar = arrayOf('d', 'e', 'f')
    val arrayOfInt = intArrayOf(0)
    val arrayOfLong = longArrayOf(0, 1, 2)
    val arrayOfNumber: Array<Byte> = arrayOf(0, 1, 2)

    arrayOfChar.set(2, 'a')

    val listOfChar = mutableListOf('a', 'b')
    val arrayListOfChar = arrayListOf('a', 'b')
    listOfChar.add('a')
    listOfChar.add('b')

    val setOfChar: MutableSet<Char> = mutableSetOf('a', 'b')
    setOfChar.add('a')
    setOfChar.add('b')

    val rangeNumber = 1..10
    val rangeUpTo = 1.rangeTo(10)
    val rangeUpToWithStep = 1.rangeTo(10) step 2
    val rangeDownTo = 10.downTo(0)
    val rangeUntil: IntRange = 1 until 10

    println("variable: $variable")
    println("string index ke 0: ${variable[0]}")
    println("array of char: $arrayOfChar")
    println("list of char: $listOfChar")
    println("set of char: $setOfChar")
    println("list of char without duplication: ${listOfChar.toSet()}")
    println("range: $rangeNumber")
    rangeNumber.forEach { number ->
        println("range: $number")
    }
}