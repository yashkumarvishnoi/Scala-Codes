class Area(length: Double,breadth: Double){
    def returnArea():Double={
        val ar=length*breadth
        return ar
    }

}

object Three{
    def main(args:Array[String]):Unit={
        print("Enter the length of rectangle:- ")
        val l=scala.io.StdIn.readDouble()
        print("Enter the breadth of reactangle:- ")
        val b=scala.io.StdIn.readDouble()
        val rect= new Area(l,b)
        val area=rect.returnArea()

        print(s"Area of rectangle with length $l and breadth $b is $area")

    }
}