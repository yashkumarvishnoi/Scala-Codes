// Base class Shape with a method draw
class Shape {
  def draw(): Unit=println("Drawing a shape")
}

// Subclass Circle overriding the draw method
class Circle extends Shape {
  override def draw(): Unit = println("Drawing a circle")
}

// Subclass Rectangle overriding the draw method
class Rectangle extends Shape {
  override def draw(): Unit = println("Drawing a rectangle")
}

// Subclass Triangle overriding the draw method
class Triangle extends Shape {
  override def draw(): Unit = println("Drawing a triangle")
}

object Five {
  def main(args: Array[String]): Unit = {
    // Create instances of Circle, Rectangle, and Triangle
    val circle = new Circle
    val rect = new Rectangle
    val tri = new Triangle

    // Call the draw method on each instance
    circle.draw()
    rect.draw()
    tri.draw()
  }
}
