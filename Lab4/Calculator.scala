object Calculator{
  def Math(f:(Int,Int)=> Double,a:Int,b:Int)=f(a,b)
  def Sum(a:Int,b:Int)=a+b
  def Sub(a:Int,b:Int)=a-b
  def Mul(a:Int,b:Int)=a*b
  def Div(a:Int,b:Int)=a/b

  def main(args: Array[String]): Unit={
    println("Enter the operator")
    val ch=scala.io.StdIn.readChar()
    println("Enter the 1st number")
    val a=scala.io.StdIn.readInt()
    println("Enter the 2nd number")
    val b=scala.io.StdIn.readInt()

    print(s"$a $ch $b=")
    if(ch=='+')
      {
        println(Math(Sum,a,b))
      }
    if(ch=='-')
      {
        println(Math(Sub,a,b))
      }
    if(ch=='*')
      {
        println(Math(Mul,a,b))
      }
    if(ch=='/')
      {
        println(Math(Div,a,b))
      }
      
    }
}