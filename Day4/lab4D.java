import java.util.Scanner;

class Shape {
    protected double area;

    public void showArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
    }

    private void calculateArea() {
        area = Math.PI * radius * radius;
    }

    @Override
    public void showArea() {
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calculateArea();
    }

    private void calculateArea() {
        area = length * width;
    }

    @Override
    public void showArea() {
        System.out.println("Rectangle Area: " + area);
    }
}

public class lab4D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        circle.showArea();

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.showArea();

        scanner.close();
    }
}