class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void area() {
        System.out.println("Calculating area");
    }
}

// Child class Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void area() {
        System.out.println("Area of the circle: " + (Math.PI * radius * radius));
    }
}

// Child class Rectangle
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void area() {
        System.out.println("Area of the rectangle: " + (length * width));
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5); // Circle with radius 5
        Shape shape2 = new Rectangle(4, 6); // Rectangle with length 4 and width 6

        shape1.draw();
        shape1.area();

        shape2.draw();
        shape2.area();
    }
}
