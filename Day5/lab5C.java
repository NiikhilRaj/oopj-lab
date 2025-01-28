import java.util.Scanner;

interface Employee {
    double earnings();
    double deductions();
    double bonus();
}

abstract class Manager implements Employee {
    protected double basicSalary;

    public Manager(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double earnings() {
        double da = 0.80 * basicSalary;
        double hra = 0.15 * basicSalary;
        return basicSalary + da + hra;
    }

    @Override
    public double deductions() {
        return 0.12 * basicSalary;
    }
}

class Substaff extends Manager {

    public Substaff(double basicSalary) {
        super(basicSalary);
    }

    @Override
    public double bonus() {
        return 0.50 * basicSalary;
    }
}

public class lab5C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();
        scanner.close();

        Substaff substaff = new Substaff(basicSalary);
        System.out.println("Earnings: " + substaff.earnings());
        System.out.println("Deductions: " + substaff.deductions());
        System.out.println("Bonus: " + substaff.bonus());
    }
}