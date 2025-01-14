import java.util.Scanner;

class Account {
    long acc_no;
    double balance;

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    @Override
    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class lab4E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] persons = new Person[5];

        for (int i = 0; i < 5; i++) {
            persons[i] = new Person();
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Account Number: ");
            persons[i].acc_no = sc.nextLong();
            System.out.print("Balance: ");
            persons[i].balance = sc.nextDouble();
            sc.nextLine(); 
            System.out.print("Name: ");
            persons[i].name = sc.nextLine();
            System.out.print("Aadhar Number: ");
            persons[i].aadhar_no = sc.nextLine();
        }

        System.out.println("\nDetails of all persons:");
        for (Person person : persons) {
            person.disp();
            System.out.println();
        }

        sc.close();
    }
}