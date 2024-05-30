class Triangle2 {
   var side1: Double = _
   var side2: Double = _
   var side3: Double = _

  // Auxiliary constructor taking three sides as parameters
  def this(s1: Double, s2: Double, s3: Double) = {
    this() // Call to primary constructor
    side1 = s1
    side2 = s2
    side3 = s3
  }

  // Function to calculate the area of the triangle using Heron's formula
  def calculateArea(): Double = {
    val s = (side1 + side2 + side3) / 2
    math.sqrt(s * (s - side1) * (s - side2) * (s - side3))
  }

  // Function to calculate the perimeter of the triangle
  def calculatePerimeter(): Double = {
    side1 + side2 + side3
  }
}

object Four {
  def main(args: Array[String]): Unit = {
    // Create an instance of the Triangle class with sides 3, 4, and 5
    val triangle = new Triangle2(3, 4, 5)

    // Calculate area and perimeter
    val area = triangle.calculateArea()
    val perimeter = triangle.calculatePerimeter()

    // Print the results
    println("Area of the triangle: " + area)
    println("Perimeter of the triangle: " + perimeter)
  }
}
