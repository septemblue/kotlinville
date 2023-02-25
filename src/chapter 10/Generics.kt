fun main() {
    val catVet = Vet<Cat>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()

//    val contest = Contest<Marion>() can't because we specify the type
    val catContest = Contest<Cat>(catVet)

    catContest.addScore(cat = Cat(name = "Anggora"), 20)
    catContest.addScore(cat = Cat(name = "Persian"), 40)
    catContest.addScore(cat = Cat(name = "Justice"), 35)
//    catContest.addScore(Fish(name = "Wadaw"), 30) Cant because we add restriction
    println(catContest.getWinners().first().name)
    val petRetailer: Retailer<Pet> = CatRetailer() // cant without covariant "out"
    val fishContest = Contest<Fish>(petVet)// cant without contra variant "in"


}
abstract class Pet(var name: String)
class Cat(name: String) : Pet(name)
class Horse(name: String) : Pet(name)
class Fish(name: String) : Pet(name)
class Marion(name: String)

class Vet <T: Pet> {
    fun treat(t: T) {
        println("Treat Pet ${t.name}")
    }
}

class Contest<T: Pet>(var vet: Vet<in T>) {
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(cat: T, score: Int = 0) {
        if (score >= 0)
            scores.put(cat, score)
    }

    fun getWinners(): MutableSet<T> {
        val highScore = scores.values.maxOrNull()
        val winners: MutableSet<T> = mutableSetOf()
        for ((t, score) in scores) {
            if (score == highScore) {
                winners.add(t)
            }
        }
        return winners
    }
}
interface Retailer<out T> {
    fun sell() : T
}
class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell cat")
        return Cat("")
    }
}
class DogRetailer : Retailer<Fish> {
    override fun sell(): Fish {
        println("Sell fish")
        return Fish("")
    }
}