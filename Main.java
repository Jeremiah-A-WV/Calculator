/*
File Name: Main.java
Entire Code By: Jeremiah Whitehurst
*/

// import the scanner
import java.util.Scanner;

// main class extend calculator class
public class Main extends Calculator {
  public static void main(String[] args) {
    // calculator object allows usage of the operational methods and the clear screen method
    Calculator calc = new Calculator();

    // scanner for user input
    Scanner sc = new Scanner(System.in);

    // clear screen first to get rid of clutter
    calc.clearScreen();
    
    // request user's chosen numbers, then clears the console for the next prompt
    System.out.println("Enter your numbers in order: ");
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();
    calc.clearScreen();

    // request user's chosen operator
    System.out.println("Select your operator (+, -, /, *): ");
    char choice;

    // selects the first character in whatever the user types, then clear the screen to display the answer
    choice = sc.next().charAt(0);
    System.out.flush();
    calc.clearScreen();

    // the user's chosen operator decides what method is used, respectively
    switch(choice) {
      case '+':
        System.out.println(a + " plus " + b + " equals " + calc.add(a, b));
        break;
      case '-':
        System.out.println(a + " minus " + b + " equals " + calc.subtract(a, b));
        break;
      case '/':
        System.out.println(a + " divided by " + b + " equals " + calc.divide(a, b));
        break;
      case '*':
        System.out.println(a + " multiplied by " + b + " equals " + calc.multiply(a, b));
        break;
      default:
        // if one of the given operators is not given, print an error message
        System.out.println("Invalid or illegal operation");
    }
  }
}