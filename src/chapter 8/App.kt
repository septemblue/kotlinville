class Wolf() {
    var hunger = 10
    val food = "meat"

    fun eat() {
        println("The wolf is eating $food")
    }
}
class MyWolf() {
    var wolf: Wolf? = Wolf()

    fun myFunction() {
        wolf?.eat()
    }
}
fun main() {
    var w: Wolf? = Wolf()

    if (w != null) {
        w.eat()
    }

    var x = w?.hunger
    println("The value of x is $x")

    w = null
    var y = w?.hunger ?: -1
    println("The value of y is $y")

    var myWolf: MyWolf? = MyWolf()
    myWolf?.let {
        it.wolf?.let {
            println("${it.hunger}")
        }
    }

    var myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray) {
        item?.let {
            println(item)
        }
    }
    //    var z = w!!.hunger // w= null here
}