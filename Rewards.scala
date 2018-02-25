/*
Enter an alphanumeric code
depending on what list it matches with the user will gain points

the codes can come from the tickets or as a result 
of riding on the bus with the app open while connected to bus wifi
(depending on the amount of time spent the user will gain a code with 
specific point values)

or the code will be put on the ticket that they buy
*/

package via

object Rewards {
  def authentication(str: String):Boolean = {
    var temp = "Sorry that code does not work\nPlease try again\n"
    var num = 0
    var str1 = str.toLowerCase()
    var bool = true
    
    if (str1 == "show") {
      temp = ""
      MyArrayBuffer.showContents()     
    }
    
    if (MyArrayBuffer.valueExists(str1)) {
      num = MyArrayBuffer.getPoints(str1)
      MyArrayBuffer.removeCode(str1)
      temp = num + " point(s) have been added to your account\nThank you for riding with VIA!\n"
      bool = false
    }
    println(temp)
    bool
  }

  def main(args: Array[String]) {
    var a = true
    Code.make()
    while (a == true) {
      println("Enter code here ")
      var result = scala.io.StdIn.readLine();
      a = authentication(result)
    }
  }

}
