/*
File Name: Calculator.java
Entire Code By: Jeremiah Whitehurst
*/

class Calculator {
  Calculator() {}

  // adds the parameters together
  public static int add(int a, int b) {
    return (a + b);
  }

  // subtracts the second parameter from the first one
  public static int subtract(int a, int b) {
    return (a - b);
  }

  // divides the first parameter by the second one
  public static int divide(int a, int b) {
    return (a / b);
  }

  // multiplies the first parameter by the second one
  public static int multiply(int a, int b) {
    return (a * b);
  }

  // use escape sequence to clear the console, and then use the flush method to get rid of the remaining bytes
  public static void clearScreen() {
    System.out.print("\033[H\033[2J");  
    System.out.flush();
  }
}