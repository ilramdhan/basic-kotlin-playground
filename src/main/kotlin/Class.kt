import anang.anang2.Anang

fun main() {
    val cat = Animal("kucing")
    cat.breath()
    print(Animal.value)
    Animal.check()

    val dog = Animal("anjing")
    dog.breath()

    Object.breath("unknown")

    val anang = Anang()
    anang.name

    val bat = Animal("kelelawar", 10)
    bat.checkAge()
    bat.checkGender()

    val bird = Animal("burung", Gender.MALE)
    bird.checkGender()
    bird.checkAge()

//    val catJava = AnimalJava("kucing java")
//    catJava.breath()

    when (bird.gender) {
        Gender.MALE -> {

        }
        Gender.FEMALE -> {

        }
    }

    val gender = "male"
    when (gender) {
        "Male" -> {

        }
        "female" -> {

        }
    }
}