package level2;
import java.util.*;
public class StudentGrades {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];

        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 1; i <= n; i++) {
            while (true) {
                System.out.println("Enter marks for student " + i + ":");

                int mark = sc.nextInt();
                if (mark >= 0) {
                    physics[i] = mark;
                    break;
                }
            }
            while (true) {
                int mark = sc.nextInt();
                if (mark >= 0) {
                    chemistry[i] = mark;
                    break;
                }
            }
            while (true) {
                int mark = sc.nextInt();
                if (mark >= 0) {
                    maths[i] = mark;
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            double percent = (physics[i] + chemistry[i] + maths[i]) / 300.0 * 100;
            percentages[i] = percent;
            if (percent >= 90) grades[i] = 'A';
            else if (percent >= 75) grades[i] = 'B';
            else if (percent >= 50) grades[i] = 'C';
            else if (percent >= 35) grades[i] = 'D';
            else grades[i] = 'F';
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d %d %.2f %c\n", i + 1, physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }

        sc.close();
    }
}