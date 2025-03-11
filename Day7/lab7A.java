import java.util.Scanner;

public class lab7A {
    static class CounterThread extends Thread {
        int lowerRange;
        int upperRange;

        public CounterThread(String name, int lowerRange, int upperRange) {
            super(name);
            this.lowerRange = lowerRange;
            this.upperRange = upperRange;
        }

        @Override
        public void run() {
            System.out.println("Thread - " + getName());
            System.out.print("Counter - ");
            
            for (int i = lowerRange; i <= upperRange; i++) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(5); // 5 milliseconds gap
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                    return;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Name of the thread - ");
        String threadName = scanner.nextLine();
        
        System.out.print("Lower range of counter - ");
        int lowerRange = scanner.nextInt();
        
        System.out.print("Upper range of counter - ");
        int upperRange = scanner.nextInt();
        
        CounterThread thread = new CounterThread(threadName, lowerRange, upperRange);
        thread.start();
        
        scanner.close();
    }
}