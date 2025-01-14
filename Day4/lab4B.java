import java.util.*;
public class lab4B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice \n 1.plate\n 2.box\n 3.wooden box");
        int choice= scanner.nextInt();
        if (choice==1) {
            System.out.print("Enter length and breadth: ");
            double length= scanner.nextDouble();
            double breadth=scanner.nextDouble();
            Plate p= new Plate(length, breadth);
            p.findArea();
        }
        else if (choice==2) {
            System.out.print("Enter length and breadth and height: ");
            double length= scanner.nextDouble();
            double breadth=scanner.nextDouble();
            double height=scanner.nextDouble();
            Box p= new Box(length, breadth, height);
            p.findArea();
        }
        else if (choice==3) {
            System.out.print("Enter length, breadth, height and thickness: ");
            double length= scanner.nextDouble();
            double breadth=scanner.nextDouble();
            double height=scanner.nextDouble();
            double thickness=scanner.nextDouble();
            WoodenBox p= new WoodenBox(length, breadth, height, thickness);
            p.findArea();
        }
        else System.out.println("Invalid choice.");
        scanner.close();
    }
    
}
class Plate{
    double length;
    double breadth;
    Plate(double l, double b){
        this.length=l;
        this.breadth=b;
    }
    double area(){
        return length*breadth;
    }
    void findArea(){
        double a= area();
        System.out.println("The area is: "+ a);
    }
}
class Box extends Plate{
    double height;
    Box(double l, double b,double h){
        super(l, b);
        this.height=h;
    }
    @Override
    double area(){
        return length*breadth*height;
    }
}
class WoodenBox extends Box{
    double thichkness;
    WoodenBox(double l, double b, double h, double t){
        super(l, b, h);
        this.thichkness=t;
    }
    @Override
    double area(){
        return length*breadth*height*thichkness;
    }
}