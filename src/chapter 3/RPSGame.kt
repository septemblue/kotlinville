

import java.util.Random
import finalResult
fun main() {
  val options = arrayOf<String>("Rock", "Paper", "Scissor")
  
  val gameChoice = getGameChoice(options)  
  val userChoice = getUserChoice(options) 
  
  finalResult(userChoice, gameChoice)

}

fun getGameChoice(options: Array<String>) : String = options[(Math.random() * options.size).toInt()]
fun getUserChoice(options: Array<String>): String {

  var isValidChoice = false
  var userChoice = ""

  while (!isValidChoice) {

    println("Please enter one of the following:")
    for ( option in options) {
      print(" $option")
    }
    println("")
    val userInput = readLine()
    if(userInput != null && userInput in options) {
      isValidChoice = true
      userChoice = userInput
    }
    if(!isValidChoice) println("You must enter valid choice")

  }

  return userChoice
}
fun finalResult(userChoice: String, gameChoice: String) {
  if(userChoice == gameChoice) println("Tie")
  else if((userChoice == "Rock" && gameChoice == "Scissor") || (userChoice == "Scissor" && gameChoice == "Paper") || (userChoice == "Paper" && gameChoice == "Rock")) println("You win")
  else println("You lose")
}