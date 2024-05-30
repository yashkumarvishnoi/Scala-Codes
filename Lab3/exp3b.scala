object exp3b{
  def main(args: Array[String]): Unit={
     println("Enter 1st number")
        val a = scala.io.StdIn.readInt()
        println("Enter 2nd Number")
        val b = scala.io.StdIn.readInt()

        def largestInt(a:Int, b:Int): Int ={
            if(a>b){
                return a
            }else if(a==b){
                return a
            }else{
                return b
            }
        }
        println(s"Larger Integer is: "+ largestInt(a,b))

  }
}