fun main() {

    var x = 5
    x = 17

    val y = 5
    //  y = 6 <- Cant

    //    val z: Int = 18.75 <- can;t
    var z: Float = 3.75F

    val a: Int = 3
    x = a // means referring to same object
//    x = z <- cant because in line 4, x assigned to Int

    x = z.toInt() // <- can, because z has temporarily changed to int
}