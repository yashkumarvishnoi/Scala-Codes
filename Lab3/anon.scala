object anon{
    def main(args:Array[String]):Unit={
        var a=scala.io.StdIn.readInt();
        var b=scala.io.StdIn.readInt();

        val add= (i:Int,j:Int)=> i+j
        val sub= (i:Int,j:Int)=> i-j
        val mul = (i:Int,j:Int)=> i*j
        val div= (i:Int,j:Int)=> i/j


        print("sum= "+(add(a,b)))
        print("Subtraction= "+(sub(a,b)))
        print("Multiplication= "+(mul(a,b)))
        print("Division= "+(div(a,b)))

    }
}