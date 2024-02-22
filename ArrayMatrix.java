import java.util.Arrays;

public class MatrixCreation {
    public static void main(String[] args) {
        // Define the size of the matrix
        int rows = 3;
        int cols = 4;

        // Create a 2D matrix
        int[][] matrix = new int[rows][cols];

        // Fill the matrix with values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = i * cols + j + 1;
            }
        }

        // Print the matrix
        System.out.println("Matrix:");
        printMatrix(matrix);
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
