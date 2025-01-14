import java.util.Scanner;

class Interest {
    double principal;
    double rate;
    int time;

    Interest(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    void display() {
        System.out.println("Interest class display method");
    }
}

class SimpleInterest extends Interest {

    SimpleInterest(double principal, double rate, int time) {
        super(principal, rate, time);
    }

    @Override
    void display() {
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}

class CompoundInterest extends Interest {

    CompoundInterest(double principal, double rate, int time) {
        super(principal, rate, time);
    }

    @Override
    void display() {
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;
        System.out.println("Compound Interest: " + compoundInterest);
    }
}

public class lab4C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time period in years: ");
        int time = scanner.nextInt();

        System.out.print("Enter your choice (1 for Simple Interest, 2 for Compound Interest): ");
        int choice = scanner.nextInt();

        Interest interest;
        if (choice == 1) {
            interest = new SimpleInterest(principal, rate, time);
        } else if (choice == 2) {
            interest = new CompoundInterest(principal, rate, time);
        } else {
            System.out.println("Invalid choice");
            scanner.close();
            return;
        }

        interest.display();
        scanner.close();
    }
}