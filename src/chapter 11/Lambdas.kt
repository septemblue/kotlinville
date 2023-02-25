typealias DoubleConversion = (Double) -> Double
fun main() {
    val addFive: (Int) -> Int
    addFive = {it + 5}
    println("Pass number 5 to addFive = ${addFive.invoke(5)}")

    val addInts = {x: Int, y: Int -> x + y}
    println("add two number 3 and 5 by addints = ${addInts(3, 5)}")

    val intLamda: (Int, Int) -> Int = {x, y -> x * y}
    println("Mult number 3 and 5 by intLambda = ${intLamda(3, 5)}")

    val myLambda: () -> Unit = {println("Hello")}
    myLambda()

    convert(5.0, {x -> x * 1.8 + 32})
    val pounds = getConversionLambda("KgsToPounds")
    pounds(3.5)
}

fun convert(x: Double, converter: DoubleConversion) : Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}
fun convertFive(converter: (Int) -> Double) : Double{
    val result = converter(5)
    println("5 is converted to $result")
    return result
}
fun getConversionLambda(str: String) : (Double) -> Double {
    if(str.equals("CentigradeToFarenheit")) {
        return {it * 1.8 + 32}
    }else if (str.equals("KgsToPounds")) {
        return {it * 2.204623}
    } else return {it}
}