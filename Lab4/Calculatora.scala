object Calculatora{
    def getFunc(s:String)= {
        def Sum(a:Int,b:Int)=a+b
        def Sub(a:Int,b:Int)=a-b
        def Mul(a:Int,b:Int)=a*b
        def Div(a:Int,b:Int)=a/b

        if(s == "+"){
            Sum _
        }
        if(s == "-"){
            Sub _
        }
         if(s == "*"){
            Mul _
        }
         if(s == "/"){
            Div _
        }
    }
    def main(args:Array[String]):Unit={
        println("Enter the operator")
    val ch=scala.io.StdIn.readLine()
    println("Enter the 1st number")
    val a=scala.io.StdIn.readInt()
    println("Enter the 2nd number")
    val b=scala.io.StdIn.readInt()

    var d=getFunc(ch);
    print(s"Result of $a $ch $b= ")
    print(d(a,b))

    }
}