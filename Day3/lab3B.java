import java.util.Scanner;

public class lab3B {

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static double area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("The area of the circle is: " + area(radius));
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                System.out.println("The area of the triangle is: " + area(base, height));
                break;
            case 3:
                System.out.print("Enter the side of the square: ");
                int side = scanner.nextInt();
                System.out.println("The area of the square is: " + area(side));
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}