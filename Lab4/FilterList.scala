object FilterList{
    def main(args:Array[String]):Unit={
        def isEven(a:Int):Boolean=
            {
                a % 2==0
            }
            def isOdd(a:Int):Boolean={
                a % 2 !=0
            }
            def isPositive(a:Int):Boolean={
                a > 0
            }
            def isNegative(a:Int):Boolean={
                a < 0
            }
            def isZero(a:Int):Boolean={
                a == 0
            }
            

            def filterlist(nums:List[Int],filterfunc: Int => Boolean): List[Int]={
                nums.filter(filterfunc)
            }
            val numbers= List(1,2,3,4,0,-1,-2)
            println("The Original List: "+(numbers))

            println("Even numbers: "+(filterlist(numbers, isEven)))
            println("Odd numbers: "+(filterlist(numbers, isOdd)))
            println("Positive numbers: "+(filterlist(numbers, isPositive)))
            println("Negative numbers: "+(filterlist(numbers, isNegative)))
            println("Zeroes: " +(filterlist(numbers, isZero)))
          
    }
}