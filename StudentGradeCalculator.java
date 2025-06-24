import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Marks of Student: ");
        System.out.println("Hindi");
        int hindi = scanner.nextInt();
        if (hindi < 1 || hindi > 100) {
            System.out.println("Invalid input! Marks should be between 1 and 100.");
            return;
        }

        System.out.println("English");
        int english = scanner.nextInt();
        if (hindi < 1 || hindi > 100) {
            System.out.println("Invalid input! Marks should be between 1 and 100.");
            return;
        }
        
        System.out.println("Maths");
        int maths = scanner.nextInt();
        if (hindi < 1 || hindi > 100) {
            System.out.println("Invalid input! Marks should be between 1 and 100.");
            return;
        }
        
        System.out.println("Science");
        int science = scanner.nextInt();
        if (hindi < 1 || hindi > 100) {
            System.out.println("Invalid input! Marks should be between 1 and 100.");
            return;
        }
        
        System.out.println("Social Science");
        int socialScience = scanner.nextInt();
        if (hindi < 1 || hindi > 100) {
            System.out.println("Invalid input! Marks should be between 1 and 100.");
            return;
        }

        int totalMarks = hindi + english + maths + science + socialScience;
        double percentage = (double) totalMarks / 5;

        System.out.println("Total Marks: " + totalMarks);

        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
            System.out.println("Better Luck Next Time!");
        }

        System.out.print("Do you want to see Grade Chart? If Yes then press Y: ");
        char choice = scanner.next().charAt(0);

        if (choice == 'Y' || choice == 'y') {
            System.out.println("Grade Chart");
            System.out.println(" Above 90 Grade A");
            System.out.println(" Above 80 Grade B");
            System.out.println(" Above 70 Grade C");
            System.out.println(" Above 60 Grade D");
            System.out.println(" Above 40 Grade E");
            System.out.println(" Below 40 Grade F");
        } else {
            System.out.println("Thank You");
        }

        scanner.close();

    }
}
