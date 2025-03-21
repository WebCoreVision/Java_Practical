
import java.util.Scanner;
public class StaticDemo {
 // Static method to calculate the sum of two integers
 public static int add(int a, int b) {
 return a + b;
 }
 // Static method to calculate the product of two integers
 public static int multiply(int a, int b) {
 return a * b;
 }
 // Static method to calculate the square of an integer
 public static int square(int a) {
 return a * a;
 }
 public static void main(String[] args) {
 // Creating a Scanner object for user input
 Scanner sc = new Scanner(System.in);
 // Taking user input for addition
 System.out.println("Enter two integers to add:");
 int num1 = sc.nextInt();
 int num2 = sc.nextInt();
 System.out.println("Sum of " + num1 + " and " + num2 + ": " +
StaticDemo.add(num1, num2));
 // Taking user input for multiplication
 System.out.println("Enter two integers to multiply:");
 int num3 = sc.nextInt();
 int num4 = sc.nextInt();
 System.out.println("Product of " + num3 + " and " + num4 + ": " +
StaticDemo.multiply(num3, num4));
 // Taking user input for squaring a number
 System.out.println("Enter an integer to square:");
 int num5 = sc.nextInt();
 System.out.println("Square of " + num5 + ": " +
StaticDemo.square(num5));
 // Close the scanner
 sc.close();
 }
}