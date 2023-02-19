class Recipes {
    data class Recipe(
        val title: String,
        val mainIngridient: String,
        val isVegetarian: Boolean = false,
        val difficulty: String = "Easy"
    )
}
class Bong(val name:String, val model:String) {

}
fun main() {
    var r1 = Recipes.Recipe("Thai Curry", "Beef", isVegetarian = true)
    var r2 = Recipes.Recipe("Thai Curry", "Chicken")
    var r3 = r1.copy(title = "Chicken Buna")

    println("r1  hash code: ${r1.hashCode()}")
    println("r2  hash code: ${r2.hashCode()}")
    println("r3  hash code: ${r3.hashCode()}")

    println("r1 toString: ${r1.toString()}")
    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")

    val (title, vegetarian) = r1
    println("$title, $vegetarian")

    var b1 = Bong("Bang", "easy")
    var b2 = Bong("Bang", "easy")
    var b3 = Bong("Bong", "hard")

    println("b1 == b2? ${b1 == b2}")
    println("b1 === b2? ${b1 === b2}")
    println("b1 == b3? ${b1 == b3}")

//    val (name, model) = b1 cant
//    var b3 = b1.copy() cant
}