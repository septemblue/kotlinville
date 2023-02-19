open class Vehicle() {
    val nothingHere: String
        get() = ""
}


class Plane : Vehicle(), Honkable, RocketBlaster {
    override fun honk() {
        TODO("Not yet implemented")
    }
    fun fly() {
        println("zshooos")
    }

    override fun launchRocket() {
        TODO("Not yet implemented")
    }

}

interface Honkable {
    fun honk();
    val volume: Int
        get() = 20
}
interface RocketBlaster {
    fun launchRocket()
}