import java.util.Scanner;

public class SingularMatrixChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();

        double[][] matrix = new double[n][n];

        System.out.println("Enter the elements of the square matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        if (isSingular(matrix)) {
            System.out.println("The matrix is a singular matrix.");
        } else {
            System.out.println("The matrix is not a singular matrix.");
        }

        scanner.close();
    }

    // Function to check if a square matrix is singular
    public static boolean isSingular(double[][] matrix) {
        if (matrix.length != matrix[0].length) {
            return false; // Not a square matrix
        }

        int n = matrix.length;
        double determinant = calculateDeterminant(matrix, n);

        return determinant == 0;
    }

    // Function to calculate determinant of a matrix using recursion
    public static double calculateDeterminant(double[][] matrix, int n) {
        if (n == 1) {
            return matrix[0][0];
        }

        double det = 0;
        int sign = 1;

        for (int i = 0; i < n; i++) {
            double[][] minor = new double[n - 1][n - 1];
            getCofactor(matrix, minor, 0, i, n);
            det += sign * matrix[0][i] * calculateDeterminant(minor, n - 1);
            sign = -sign;
        }

        return det;
    }

    // Function to get the cofactor of a matrix
    public static void getCofactor(double[][] matrix, double[][] temp, int p, int q, int n) {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != p && col != q) {
                    temp[i][j++] = matrix[row][col];

                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }
}
