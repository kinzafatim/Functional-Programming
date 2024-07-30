object Calculator {
  // Arithmetic operations
  def add(x: Double, y: Double): Double = x + y
  def subtract(x: Double, y: Double): Double = x - y
  def multiply(x: Double, y: Double): Double = x * y
  def divide(x: Double, y: Double): Double = x / y

  // Perform calculation based on operation
  def calculate(num1: Double, operation: String, num2: Double): String = {
    operation match {
      case "+" => s"Result: ${add(num1, num2)}"
      case "-" => s"Result: ${subtract(num1, num2)}"
      case "*" => s"Result: ${multiply(num1, num2)}"
      case "/" =>
        if (num2 != 0) s"Result: ${divide(num1, num2)}"
        else "Error: Cannot divide by zero"
      case _ => "Error: Unsupported operation. Use +, -, *, /"
    }
  }

  // Main function to interact with the user
  def main(args: Array[String]): Unit = {
    println("Welcome to the Scala Calculator!")
    println("Type '0' to quit the calculator.")

    var continue = true
    while (continue) {
      print("Enter first number: ")
      val num1 = scala.io.StdIn.readLine().trim.toDouble

      print("Enter operation (+, -, *, /): ")
      val operation = scala.io.StdIn.readLine().trim

      print("Enter second number: ")
      val num2 = scala.io.StdIn.readLine().trim.toDouble

      // Perform calculation and print result or error
      println(calculate(num1, operation, num2))

      // Display menu for continuation or exit
      println("\nWould you like to perform another calculation or exit?")
      println("Type '1' to perform another calculation or '0' to quit.")

      scala.io.StdIn.readLine().trim match {
        case "0" => continue = false
        case "1" => // Continue loop
        case _ => println("Invalid input. Please type '0' to quit or '1' to continue.")
      }
    }

    println("Thank you for using the Scala Calculator!")
  }
}
