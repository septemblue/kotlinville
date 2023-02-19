abstract class Animals {
    abstract var weight : Int
    abstract var name : String
    open var model: String
        get() = " "
        set(value) {}
    var wings = false

    fun sleep() {

    }
    abstract fun walk()
    open fun run() {

    }
}

class Khudanil: Animals() {
    override var weight: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    override var name: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun walk() {
        TODO("Not yet implemented")
    }

}
