open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println("The animal is making noise")
    }
    fun sleep() {
        println("animal is sleeping")
    }
}
class Hippo: Animal() {
    override val food: String
        get() = super.food
    override val image: String
        get() = "Hippo.jpg"

    fun swim() {
        hunger += 10
        println("Hunger is increased $hunger")
    }
}
fun main() {
    val tobaLakeAnimals: Array<Animal> = arrayOf(Hippo(), Hippo(), Hippo())
}