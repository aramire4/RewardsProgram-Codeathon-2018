package via
    
import io.StdIn._
import scala.collection.mutable.ArrayBuffer

object MyArrayBuffer{
    //var interactive = true
    /*
    def main(args: ArrayBuffer[(String, Int)]) = {
        //var array1 = [String]()
        var buffer = new ArrayBuffer[(String, Int)]()
    }
    */
    private var buffer = new ArrayBuffer[(String, Int)]()


    //def add(buf:ArrayBuffer[(String, Int)], value: (String, Int)) = {
    def add(value: (String, Int)) = {
        buffer += value

    }

    //def remove(buf:ArrayBuffer[(String, Int)], value: (String, Int)) = {
    //def remove(value: (String, Int)) = {
    def removeCode(value: String) = {
        var temp = (value, getPoints(value))
        buffer -= temp
    }

    //def valueExists(buf:ArrayBuffer[(String, Int)], value: (String, Int)): Boolean = {
    def valueExists(value: String): Boolean = {
        //buffer.contains(value)
        var temp = false
        for(pos <- 0 until buffer.length){
            if(buffer(pos)._1 == value) temp = true
        }
        temp
    }

    def getPoints(value: String): Int = {
        buffer.toMap.get(value).get
    }

    //def length(buf:ArrayBuffer[(String, Int)]): Int ={
    def length(): Int ={
        buffer.size
    }


}
