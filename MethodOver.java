
import java.util.Scanner;
public class MethodOver {
 // Method to add two integers
 public int add(int a, int b) {
 return a + b;
 }
 // Method to add three integers (Overloaded method)
 public int add(int a, int b, int c) {
 return a + b + c;
 }
 // Method to add two double values (Overloaded method)
 public double add(double a, double b) {
 return a + b;
 }
 // Method to add two strings (Overloaded method)
 public String add(String a, String b) {
 return a + b;
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 // Creating an object of the Calculator class
 MethodOver calc = new MethodOver();
 // User-defined input for integers
 System.out.println("Enter two integers to add:");
 int num1 = sc.nextInt();
 int num2 = sc.nextInt();
 System.out.println("Sum of 2 integers: " + calc.add(num1, num2));
 // User-defined input for three integers
 System.out.println("Enter three integers to add:");
 int num3 = sc.nextInt();
 int num4 = sc.nextInt();
 int num5 = sc.nextInt();
 System.out.println("Sum of 3 integers: " + calc.add(num3, num4,
num5));
 // User-defined input for doubles
 System.out.println("Enter two double values to add:");
 double num6 = sc.nextDouble();
 double num7 = sc.nextDouble();
 System.out.println("Sum of 2 doubles: " + calc.add(num6, num7));
 // User-defined input for strings
 System.out.println("Enter two strings to concatenate:");
 sc.nextLine(); // Consume the leftover newline
 String str1 = sc.nextLine();
 String str2 = sc.nextLine();
 System.out.println("Concatenation of strings: " + calc.add(str1,
str2));
 // Close the scanner
 sc.close();
 }
}