import java.util.Scanner;

abstract class Student {
    int rollNo;
    int regNo;

    abstract void course(String subject);
    abstract void branch(String branchName);
}

class Generic extends Student {

    @Override
    void course(String subject) {
        System.out.println("Course: " + subject);
    }

    @Override
    void branch(String branchName) {
        System.out.println("Branch: " + branchName);
        switch (branchName.toLowerCase()) {
            case "computer science":
                System.out.println("Details: This branch focuses on computer programming, algorithms, and software development.");
                break;
            case "electrical engineering":
                System.out.println("Details: This branch deals with the study of electrical systems, circuits, and power generation.");
                break;
            case "mechanical engineering":
                System.out.println("Details: This branch involves the design, analysis, and manufacturing of mechanical systems.");
                break;
            case "chemical engineering":
                System.out.println("Details: This branch focuses on chemical processes, production, and the development of new materials.");
                break;
            case "civil engineering":
                System.out.println("Details: This branch is concerned with the design, construction, and maintenance of infrastructure projects.");
                break;
            default:
                System.out.println("Details: Unknown branch.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Generic student = new Generic();

        System.out.print("Enter the branch name: ");
        String branchName = scanner.nextLine();
        student.branch(branchName);

        System.out.print("Enter the course name: ");
        String courseName = scanner.nextLine();
        student.course(courseName);

        scanner.close();
    }
}