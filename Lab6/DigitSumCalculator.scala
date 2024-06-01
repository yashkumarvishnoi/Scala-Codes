object DigitSumCalculator {
  // Recursive function to compute the sum of digits of a double value
  def sumDigits(value: Double): Int = {
    // Convert the double value to a string
    val stringValue = value.toString
    
    // Define a helper function to compute the sum of digits recursively
    def sumHelper(index: Int, sumSoFar: Int): Int = {
      // Base case: If we've reached the end of the string, return the current sum
      if (index >= stringValue.length) {
        sumSoFar
      } else {
        // Recursive case: Add the current digit to the sumSoFar and move to the next digit
        val digit = stringValue.charAt(index).asDigit
        sumHelper(index + 1, sumSoFar + digit)
      }
    }
    
    // Start the recursion from index 0 with initial sum 0
    sumHelper(0, 0)
  }
}

// Main method to demonstrate the usage of sumDigits function
object DigitSumCalculatorExample {
  def main(args: Array[String]): Unit = {
    // Test the sumDigits function with various double values
    val sum1 = DigitSumCalculator.sumDigits(123.45)
    println("Sum of digits for 123.45: " + sum1) // Output: 15 (1 + 2 + 3 + 4 + 5 = 15)
    
    val sum2 = DigitSumCalculator.sumDigits(987.654)
    println("Sum of digits for 987.654: " + sum2) // Output: 33 (9 + 8 + 7 + 6 + 5 + 4 = 33)
    
    val sum3 = DigitSumCalculator.sumDigits(12345.6789)
    println("Sum of digits for 12345.6789: " + sum3) // Output: 45 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45)
  }
}
