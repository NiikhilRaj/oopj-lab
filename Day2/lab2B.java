import java.io.IOException;
public class lab2B {
    public static void main(String[] args) throws IOException{
        if (args.length!=10) {
            System.out.println("Enter 10 numbers only.");
            return;
        }
        int[] arr = new int[10];
        int even=0, odd=0,i=0;
    
        for(String arg:args){
            try {
                arr[i]= Integer.parseInt(arg);
                i++;
            } catch (NumberFormatException e) {
                System.out.println("Enter valid integers");
                return;
            }
            if (arr[i-1]%2==0) {
                even++;
            }
            else odd++;
        }
        System.out.println("No. of odd numbers: "+ even);
        System.out.println("No. of even numbers: "+ odd);
    }
}
