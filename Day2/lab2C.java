import java.io.IOException;
import java.util.*;

public class lab2C {
    public static void main(String args[]) throws IOException {
        if (args.length - 1 != Integer.parseInt(args[0])) {
            System.out.println("Enter " + args[0] + " numbers only.");
            return;
        }
        int[] arr = new int[Integer.parseInt(args[0])];
        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
            try {
                arr[i - 1] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number");
                return;
            }
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
