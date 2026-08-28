import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Java: ");
        int java = sc.nextInt();

        System.out.print("Enter marks in Python: ");
        int python = sc.nextInt();

        System.out.print("Enter marks in Database: ");
        int database = sc.nextInt();

        System.out.print("Enter marks in Web Development: ");
        int web = sc.nextInt();

        System.out.print("Enter marks in Mathematics: ");
        int maths = sc.nextInt();

        int total = java + python + database + web + maths;
        double percentage = total / 5.0;

        System.out.println("\n----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("Java: " + java);
        System.out.println("Python: " + python);
        System.out.println("Database: " + database);
        System.out.println("Web Development: " + web);
        System.out.println("Mathematics: " + maths);

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        if (percentage >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        sc.close();
    }
}
