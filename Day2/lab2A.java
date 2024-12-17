import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lab2A {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the first number:");
            String input1 = reader.readLine();
            System.out.println("Enter the second number:");
            String input2 = reader.readLine();
            System.out.println("Enter the third number:");
            String input3 = reader.readLine();

            int num1, num2, num3;

            try {
                num1 = Integer.parseInt(input1);
                num2 = Integer.parseInt(input2);
                num3 = Integer.parseInt(input3);
            } catch (NumberFormatException e) {
                System.out.println("Enter valid integer inputs.");
                return;
            }

            int largest = num1;
            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;
            }

            System.out.println("The largest number among the input integers is: " + largest);
    }
}