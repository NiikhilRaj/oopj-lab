import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lab2E {
    public static void main(String[] args)throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[3][3];
        System.out.println("Enter the elements of the array(space-separated)");
        
        try {
            String[] inputs= scanner.readLine().split(" ");
            if (inputs.length!=9) {
                System.out.println("Please enter exactly 9 elements.");
                return;
            }
            int x =0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j]= Integer.parseInt(inputs[x]);
                    x++;
                }
            }
        } catch (NumberFormatException e) {
                System.out.println("Enter integers as inputs only");
        }

        int rDiag=arr[0][0]+arr[1][1]+arr[2][2], lDiag=arr[2][0]+arr[1][1]+arr[0][2];
        System.out.println("Sum of elements of left diagonal= " + lDiag + " and of right diagonal = " + rDiag);
        scanner.close();

    }
}
