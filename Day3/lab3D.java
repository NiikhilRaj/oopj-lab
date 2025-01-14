import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class lab3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll: ");
            int roll = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            students[i] = new Student(roll, name, cgpa);
        }

        System.out.println("\nDetails of students:");
        for (Student student : students) {
            System.out.println("Roll: " + student.roll + ", Name: " + student.name + ", CGPA: " + student.cgpa);
        }

        Student lowestCgpaStudent = students[0];
        for (Student student : students) {
            if (student.cgpa < lowestCgpaStudent.cgpa) {
                lowestCgpaStudent = student;
            }
        }

        System.out.println("\nStudent with the lowest CGPA:");
        System.out.println("Name: " + lowestCgpaStudent.name + ", CGPA: " + lowestCgpaStudent.cgpa);

        scanner.close();
    }
}