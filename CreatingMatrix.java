public class MatrixCreation {
    public static void main(String[] args) {
        // Define the size of the matrices
        int rows = 3;
        int cols = 3;

        // Create matrix A and fill it with numbers from 1 to 9
        int[][] matrixA = new int[rows][cols];
        int countA = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = countA++;
            }
        }

        // Create matrix B and fill it with numbers from 9 to 1
        int[][] matrixB = new int[rows][cols];
        int countB = 9;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = countB--;
            }
        }

        // Print matrix A
        System.out.println("Matrix A:");
        printMatrix(matrixA);

        // Print matrix B
        System.out.println("\nMatrix B:");
        printMatrix(matrixB);
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
