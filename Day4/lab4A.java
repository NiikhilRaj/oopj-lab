import java.util.Scanner;

public class lab4A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice \n 1.2D\n 2.3D");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter length and breadth: ");
            double length = scanner.nextDouble();
            double breadth = scanner.nextDouble();
            plate2D p = new plate2D(length, breadth);
            p.price();
        } else if (choice == 2) {
            System.out.print("Enter length and breadth and height: ");
            double length = scanner.nextDouble();
            double breadth = scanner.nextDouble();
            double height = scanner.nextDouble();
            plate3D p = new plate3D(length, breadth, height);
            p.price();
        } else {
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}

class plate2D {
    double length;
    double breadth;
    double price = 40;

    plate2D(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    double area() {
        return length * breadth;
    }

    void price() {
        double s = area();
        System.out.println("The price for " + s + " area of box is: " + s * price);
    }
}

class plate3D extends plate2D {
    double height;
    double price = 60;

    plate3D(double l, double b, double h) {
        super(l, b);
        this.height = h;
    }

    @Override
    double area() {
        return length * breadth * height;
    }

    @Override
    void price() {
        double s = area();
        System.out.println("The price for " + s + " volume of box is: " + s * price);
    }
}