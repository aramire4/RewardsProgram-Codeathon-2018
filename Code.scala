package via

object Code {
  def make() = {
    for(i <- 0 until 10){
      var s = scala.util.Random.alphanumeric.take(10).mkString
      s = s.toLowerCase
      MyArrayBuffer.add((s, i+1))
    }
    MyArrayBuffer.add(("abcdefghij", 100))
  }
  
}

