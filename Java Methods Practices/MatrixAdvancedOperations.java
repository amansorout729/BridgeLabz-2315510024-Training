package methods;
import java.util.Scanner;

public class MatrixAdvancedOperations {
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 9) + 1;
            }
        }
        return matrix;
    }
    public static int[][] transposeMatrix(int[][] M) {
        int rows = M.length;
        int cols = M[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = M[i][j];
            }
        }
        return transpose;
    }
    public static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        int[][] matrix = generateMatrix(rows, cols);

        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);
        System.out.println("\nTranspose Matrix:");
        int[][] transpose = transposeMatrix(matrix);
        printMatrix(transpose);

        sc.close();
    }
}

