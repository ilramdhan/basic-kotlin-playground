open class Animal(
    val name: String,
    val berkembangBiakDengan: String = "",
) {

    companion object {
        val value = "value"

        fun check() {
            println(value)
        }
    }

    var age: Int = 0
    var gender: Gender = Gender.MALE

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    constructor(name: String, gender: Gender) : this(name) {
        this.gender = gender
    }

    fun breath() {
        println("$name is breathing..")
    }

    fun checkAge() {
        println("$name is $age years old")
    }

    fun checkGender() {
        println("$name is $gender")
    }
}