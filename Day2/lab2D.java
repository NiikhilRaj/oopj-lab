import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class lab2D {
    public static void main(String[] args)throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array:");
        String s = scanner.readLine();

        int size = 0;
        try {
            size = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Enter a valid integer for size of the array.");
            return;
        }
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array (space-separated):");
        
        try {
            String[] inputs = scanner.readLine().split(" ");
            if (inputs.length != size) {
                System.out.println("Please enter exactly " + size + " elements.");
                return;
            }
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter valid integers for array elements.");
            return;
        }
        
        Arrays.sort(arr);
        int count=1;
        int i=0;
        while (i<size) {
            while (i<size-1 && arr[i]==arr[i+1] ) {
                count++;
                i++;
            }
            System.out.println(arr[i]+" occured " + count + "times.");
            i++;
            count=1;
        }
        scanner.close();
    }
}
