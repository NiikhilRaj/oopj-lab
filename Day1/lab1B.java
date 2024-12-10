
import java.util.Scanner;

public class lab1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        System.out.println("Enter your score:");
        score = scanner.nextInt();

        switch (score) {
            case 9:
                System.out.println("Your grade is A");
                break;
            case 8:
                System.out.println("Your grade is B");
                break;
            case 7:
                System.out.println("Your grade is C");
                break;
            case 6:
                System.out.println("Your grade is D");
                break;
            case 5:
                System.out.println("Your grade is E");
                break;
            case 4:
                System.out.println("Your grade is F");
                break;
            case 3,2,1:
                System.out.println("Your Fail");
                break;
            default:
                System.out.println("Enter a valid no between 0 and 9");
                break;
        }
        scanner.close();

    }
}
