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
    def authentication(str:String): String = {
        var temp = "Sorry that code does not work"
        var num = 0
        if(MyArrayBuffer.valueExists(str)){
           num = MyArrayBuffer.getPoints(str)
           MyArrayBuffer.removeCode(str)
           temp = num + " point(s) have been added to your account"
        }
        temp
    }

    def main(args: Array[String]){
        var  result = scala.io.StdIn.readLine();
        authentication(result)
    }

    //var s = scala.util.Random.alphanumeric.take(10).mkString
    //s.toLowerCase
}
