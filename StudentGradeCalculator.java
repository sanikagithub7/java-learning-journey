import java.util.Scanner;

public class StudentGradeCalculator {

    public static double calculateAverage(int[] marks) {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }

    public static char calculateGrade(double average) {
        if (average >= 90)
            return 'A';
        else if (average >= 80)
            return 'B';
        else if (average >= 70)
            return 'C';
        else if (average >= 60)
            return 'D';
        else
            return 'F';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        double average = calculateAverage(marks);
        char grade = calculateGrade(average);

        System.out.println("\n------ REPORT CARD ------");
        System.out.println("Student Name : " + name);

        System.out.print("Marks        : ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        System.out.println();
        System.out.printf("Average      : %.2f%n", average);
        System.out.println("Grade        : " + grade);

        if (grade == 'F')
            System.out.println("Status       : Fail");
        else
            System.out.println("Status       : Pass");

        sc.close();
    }
}
