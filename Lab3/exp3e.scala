object exp3e{
  def main(args: Array[String]): Unit={

  val add= (_:Int)+(_:Int)
  val sub= (_:Int)-(_:Int)
  val mul= (_:Int)*(_:Int)
  
       print("enter a =")
        var a = scala.io.StdIn.readInt()

        print("enter b =")
        var b = scala.io.StdIn.readInt()


  val resultAdd = add(a, b)
  val resultSub = sub(a, b)
  val resultMul = mul(a, b)

  println("Addition result: " + resultAdd) 
  println("Subtraction result: " + resultSub) 
  println("Multiplication result: " + resultMul)
}
}