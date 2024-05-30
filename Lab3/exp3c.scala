object exp3c{

    def default(str:String="Good Morning") =
    {
    println(str)
    }

    def main(args:Array[String]) =
    {
        println("Enter a message:")
        var x = scala.io.StdIn.readLine()
        default() // without any argumnet passed
        default(x)
      }
}