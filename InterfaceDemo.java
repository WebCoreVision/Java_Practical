import java.util.Scanner;

interface Area {
    void area();
}

class Rectangle implements Area {
    private double l, b, ra; 
    private Scanner sc;  // Use a shared Scanner instead of creating multiple instances

    // Constructor to initialize Scanner
    public Rectangle(Scanner sc) {
        this.sc = sc;
    }

    public void area() {
        System.out.println("Enter Length & Breadth:");
        l = sc.nextDouble();
        b = sc.nextDouble();
        ra = l * b;
        System.out.println("Area of Rectangle = " + ra);
    }
}

class Circle implements Area {
    private double r, ca;
    private Scanner sc;  

    // Constructor to initialize Scanner
    public Circle(Scanner sc) {
        this.sc = sc;
    }

    public void area() {
        System.out.println("Enter Radius:");
        r = sc.nextDouble();
        ca = 3.14 * r * r;
        System.out.println("Area of Circle = " + ca); 
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a single Scanner instance
        
        Area O1 = new Rectangle(sc);
        Area O2 = new Circle(sc);
        
        O1.area();
        O2.area();

        sc.close();  // Close the scanner to prevent resource leaks
    }   
}
