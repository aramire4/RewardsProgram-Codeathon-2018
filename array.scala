package via

object ArrayBuffer{
    import io.StdIn._
    import scala.collection.mutable.ArrayBuffer
    //var interactive = true

    def main(args: ArrayBuffer[String]) = {
        //var array1 = [String]()
        var buffer = new ArrayBuffer[String]()
    }

    def add(buf:ArrayBuffer[String], value: String) = {
        buf += value

    }

    def remove(buf:ArrayBuffer[String], value: String) = {
        buf -= value
    }

    def length(buf:ArrayBuffer[String]){
        buf.size
    }


}
