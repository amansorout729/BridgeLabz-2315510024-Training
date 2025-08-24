package level2;
import java.util.Scanner;
public class StudentGrades2D {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                while (true) {
                    int mark = sc.nextInt();
                    if (mark >= 0) {
                        marks[i][j] = mark;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percent = (total / 300.0) * 100;
            percentages[i] = percent;

            if (percent >= 90) grades[i] = 'A';
            else if (percent >= 75) grades[i] = 'B';
            else if (percent >= 50) grades[i] = 'C';
            else if (percent >= 35) grades[i] = 'D';
            else grades[i] = 'F';
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d %d %.2f %c\n", i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        sc.close();
    }
}

