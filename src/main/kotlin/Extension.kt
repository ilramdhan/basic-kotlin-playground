fun Animal.checkName() {
    println("name is $name")
}

fun String.checkLength() {
    println("panjang string $this: $length")
}

fun main() {
    val fish = Animal("ikan")
    fish.checkName()

    val string = "anang"
    string.checkLength()
}