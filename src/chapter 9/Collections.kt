import java.util.StringJoiner

fun main() {
//    listExample()
//    setExample()
    mapExample()
}

fun listExample() {
    val shopping: List<String?>
    shopping = listOf("Tea", "Eggs", "Milk", null)
    // ex
    if (shopping.isNotEmpty()) {
        println("Shop for ${shopping.get(0)}")
        println("Shop for ${shopping[1]}")
    }
    // ex
    for (item in shopping) {
        item?.let {
            println(item)
        }
    }
    //ex
    if (shopping.contains("Milk")) {
        println(shopping.indexOf("Milk"))
    }

    val mShopping: MutableList<String?> = mutableListOf("Tea", "Eggs", null)
    println("mShopping for : ${mShopping.get(0)}")
    mShopping.add("Milk")
    mShopping.add(1, "Meat")
    mShopping.removeAt(0)
    mShopping.set(1, "Coffee")
    for (item in mShopping) {
        item?.let {
            println(item)
        }
    }
    val shoppingCopy = mShopping.toList()
    mShopping.clear()
}
fun setExample() {
    val friendSet:Set<String>
    friendSet = setOf("Nabil", "Nasa", "Ilham", "Fariel")
    println(friendSet)

    val mFriendSet = mutableSetOf("Anka", "Bray", "Jose")
    val copyFriendSet = mFriendSet.toSet()
    for (friend in copyFriendSet) {
        println(friend)
    }
}

class Recipe(val name: String)
fun mapExample() {
    val r1 = Recipe("Thai Curry")
    val r2 = Recipe("Bakso Daging")
    val r3 = Recipe("Mie Yamin")

    val recipeMap = mapOf<String, Recipe>("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    if (recipeMap.containsValue(r2)) {
        val recipe = recipeMap.getValue("Recipe2")
    }
    for ((key, value) in recipeMap) {
        println("Key: $key, Value: ${value.name}")
    }
    val mRecipeMap = mutableMapOf<String, Recipe>("Recipe1" to r1, "Recipe2" to r2)
    mRecipeMap.remove("Recipe2")
    mRecipeMap.put("Recipe3", r3)
    for ((key, value) in mRecipeMap) {
        println("Key: $key, Value: ${value.name}")
    }
    val recipeMapCopy = mRecipeMap.toMap()
}