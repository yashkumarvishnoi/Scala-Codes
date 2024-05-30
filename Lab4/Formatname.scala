object Formatname{
    def main(args:Array[String]):Unit={

        def toUpper(name:String):String = {
            name.toUpperCase
        }
        def toLower(name:String):String = {
            name.toLowerCase
        }
        def reverse(name:String):String = {
            name.reverse
        }
        println("Enter the name you want to format: ")
        val name=scala.io.StdIn.readLine()

        def formatname(name:String)(func:String => String): String ={
            func(name)
        }

        println("Using the methods individually")
        println("Name in Upper Case: "+(toUpper(name)))
        println("Name in Lower Case: "+(toLower(name)))
        println("Name in Reverse: "+(reverse(name)))
        println("Using Format Name methods: ")
        println("Formatted name(Upper Case): "+(formatname(name)(toUpper)))
        println("Formatted name(Lower Case): "+(formatname(name)(toLower)))
        println("Formatted name(Reverse): "+(formatname(name)(reverse)))
    }
}