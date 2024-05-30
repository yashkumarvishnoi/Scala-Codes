// class Triangle{
//     val a: Double=3.0
//     val b: Double=4.0
//     val c: Double=5.0

//     def Perimeter: Double={
//       return a+b+c
//     }
//     def semi:Double={
//        return Perimeter/2
//     } 
//     def Area: Double={
//         val s= semi

//        return math.sqrt(s*(s-a)*(s-b)*(s-c))
//     }
// }
// object Calculate{
//     def main(args:Array[String]):Unit={
//         val trian= new Triangle()

//         println("Parameter of triangle is: "+trian.Perimeter)
//         println("Area of triangle is: "+trian.Area)
//     }
// }   
import scala.math.sqrt

class Triangle {
  
  def Area(a: Double, b: Double, c: Double): Double = {
    val s = (a + b + c) / 2
    val sq=sqrt(s * (s - a) * (s - b) * (s - c))
    return sq
  }
 // Function to calculate the perimeter of the triangle
  def Perimeter(a: Double, b: Double, c: Double): Double = {
    val p=a + b + c
    return p
  }
}

object Two {
  def main(args: Array[String]): Unit = {
    // Create an instance of the Triangle class
    val triangle = new Triangle
 // Sides of the triangle
    print("Enter the first side:-")
    val s1 = scala.io.StdIn.readDouble()
    print("Enter the second side:-")
    val s2 = scala.io.StdIn.readDouble()
    print("Enter the third side:-")
    val s3 = scala.io.StdIn.readDouble()
    // Calculate area and perimeter
    val area = triangle.Area(s1, s2, s3)
    val perimeter = triangle.Perimeter(s1, s2, s3)
 // Print the results
    println("Area of the triangle: " + area)
    println("Perimeter of the triangle: " + perimeter)
  }
}
