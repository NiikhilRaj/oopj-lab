import java.util.Scanner;


public class lab1E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Full name: " + lastName + " " + firstName);

        scanner.close();
    }
}
