object exp3d{

    def main(args:Array[String])=
    {
        print("enter a =")
        var a = scala.io.StdIn.readInt()

        print("enter b =")
        var b = scala.io.StdIn.readInt()

        println("add ="+add(a,b))
        println("sub ="+sub(a,b))
        println("mul ="+mul(a,b))
        println("div ="+div(a,b))

    }
    val add = (a:Int,b:Int)=>{a+b}
    val sub = (a:Int,b:Int)=>{a-b}
    val mul = (a:Int,b:Int)=>{a*b}
    val div = (a:Int,b:Int)=>{a/b}
}