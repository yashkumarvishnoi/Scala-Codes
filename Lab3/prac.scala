object prac{
    def main(args:Array[String]):Unit={

      var add= (_:Int)+(_:Int)
      var sub= (_:Int)-(_:Int)

        println("Enter the value of a= ")
        val a=scala.io.StdIn.readInt()

        println("Enter the value of b= ")
        val b=scala.io.StdIn.readInt()

        println(add(a,b))
        println(sub(a,b))
    }
}   