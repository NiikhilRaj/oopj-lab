import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class lab2D {
    public static void main(String[] args)throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENter the suze of the array:");
        String s = scanner.readLine();

        int size = 0;
        try {
            size = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Enter a valid integer for size of the array.");
            return;
        }
        int[] arr = new int[size];
        Arrays.sort(arr);
        //code not complete
    }
}
