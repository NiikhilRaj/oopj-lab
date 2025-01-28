import java.util.Scanner;

class Number {
    private int[] numbers;
    private int n;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = scanner.nextInt();
        numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public void swap() {
        if (n == 0) return;

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }

        int temp = numbers[maxIndex];
        numbers[maxIndex] = numbers[minIndex];
        numbers[minIndex] = temp;
    }

    public void display() {
        System.out.println("The elements after swapping the biggest and smallest elements are:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Number number = new Number();
        number.read();
        number.swap();
        number.display();
    }
}