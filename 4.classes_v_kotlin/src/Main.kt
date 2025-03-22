interface Roamable {
    fun roam()
}

abstract class Animal: Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10
        set(value)
            {
                if (value > 0) field = value
            }

    abstract fun makeNoise()

    abstract fun eat ()

    override fun roam (){
        println("Animal is roaming")
    }

    fun sleep (){
        println("Animal is sleeping")
    }
}

class Hippo : Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"
    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("Hippo is eating $food")
    }
}

    abstract class Canine : Animal() {
        override fun roam() {
            println("Canine is roaming")
        }
}
    class Wolf : Canine() {
        override val image = "wolf.jpg"
        override val food = "meat"
        override val habitat = "forests"
        override fun makeNoise() {
            println("Woof! Woof!")
        }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}

class Vehicle : Roamable {
    override fun roam() {
        println("The Vehicle is roaming")
    }
}

class Vet {
        fun giveShot(animal: Animal) {
            //Code to do something medical
            animal.makeNoise()
        }
    }

fun main(args: Array<String>) {
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    val car = Vehicle()
    car.roam()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }
}