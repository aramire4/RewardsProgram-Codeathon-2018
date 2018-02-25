package via

object Code {
  def make() = {
    for(i <- 0 until 10000){
      var s = scala.util.Random.alphanumeric.take(10).mkString
      s = s.toLowerCase
      if(!MyArrayBuffer.valueExists(s)){
        MyArrayBuffer.add((s, 10))
      }
    }
    MyArrayBuffer.add(("abcdefghij", 100))
  }
  
}

