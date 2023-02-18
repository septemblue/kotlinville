fun main() {
  val songOne = Song("Semut Hitam", "God Bless")
  val songTwo = Song("Mata Indah Bola Ping Pong", "Iwan Fals")
  val songThree = Song("Dunia Tipu-tipu", "Yura Yunita")

  songOne.play()
  songTwo.stop()
  songThree.play()
}
class Song(var title: String, val artist: String) {
  fun play() {
    println("playing the song $title by $artist")
  }

  fun stop() {
    println("Stopped playing $title")
  }
}