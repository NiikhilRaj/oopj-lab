//LAB1/A

import java.util.Scanner;

class lab1A{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String name;
		String rollNo;
        String section;
        String branch;
        
        for (int i = 0; i < 3; i++) {
            scanner.nextLine();
            System.out.println("Naam Batao: ");
            name= scanner.nextLine();

            System.out.println("Roll number Batao: ");
            rollNo= scanner.nextLine();

            System.out.println("Section Batao: ");
            section= scanner.nextLine();

            System.out.println("Branch Batao: ");
            branch= scanner.nextLine();

            System.out.println("Naam: " + name);
            System.out.println("Roll number: " + rollNo);
            System.out.println("Section: " + section);
            System.out.println("Branch: " + branch);
        }   
		scanner.close();
	}
}