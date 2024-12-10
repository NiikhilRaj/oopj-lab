import java.util.Scanner;

public class lab1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int palindrome = 0;
        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        int temp = number;
        
        while (temp != 0) {
            int remainder = temp % 10;
            palindrome = palindrome * 10 + remainder;
            temp = temp / 10;
        }

        if (number == palindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }
}
