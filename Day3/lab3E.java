import java.lang.*;
import java.util.*;

public class lab3E{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.println("Enter whose area to calculate: \n1.circle\n2.triangle\n3.square");
    int choice= scan.nextInt();
    double area;
    switch(choice){
        case 1:
            System.out.println("Enter radius:");
            double radius = scan.nextDouble();
            area=area(radius);
            System.out.println("Area is: "+ area);
            break;
        case 2:
            System.out.println("Enter base: ");
            double base = scan.nextDouble();
            System.out.println("Enter height: ");
            double height = scan.nextDouble();
            System.out.println("Area is: "+ area(base, height));
            break;
        case 3:
            System.out.println("Enter side: ");
            int side = scan.nextInt();
            System.out.println("Area is" + area(side));
            break;
        default:
            System.out.println("Invalid choice.");
            break;
    }
    }
}

public double area(double base, double height){
    return ((1/2)*base*height);
}
public double area(double radius){
    return((3.1415926535)*radius*radius);
}
public int area(int side){
    return side*side;
}