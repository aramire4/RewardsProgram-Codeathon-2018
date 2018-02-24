package via

object Code {
  def make() = {
    for(i <- 0 until 1000){
      var s = scala.util.Random.alphanumeric.take(10).mkString
      s = s.toLowerCase
      if(!MyArrayBuffer.valueExists(s)){
        MyArrayBuffer.add((s, i+1))
      }
    }
    MyArrayBuffer.add(("abcdefghij", 1001))
  }
  
}

