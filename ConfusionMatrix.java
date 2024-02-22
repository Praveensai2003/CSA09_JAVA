import java.util.Arrays;

public class ConfusionMatrix {
    public static void main(String[] args) {
        // Actual and predicted labels
        int[] actual = {1, 0, 1, 0, 1, 0, 1, 1, 0, 1};
        int[] predicted = {1, 0, 1, 0, 1, 1, 0, 1, 1, 1};

        // Create the confusion matrix
        int[][] confusionMatrix = createConfusionMatrix(actual, predicted);
        System.out.println("Confusion Matrix:");
        printMatrix(confusionMatrix);

        // Calculate TP, TN, FP, FN
        int TP = confusionMatrix[1][1];
        int TN = confusionMatrix[0][0];
        int FP = confusionMatrix[0][1];
        int FN = confusionMatrix[1][0];

        // Calculate precision, recall, and F1-score
        double precision = (double) TP / (TP + FP);
        double recall = (double) TP / (TP + FN);
        double f1Score = 2 * ((precision * recall) / (precision + recall));

        System.out.println("\nTrue Positive (TP): " + TP);
        System.out.println("True Negative (TN): " + TN);
        System.out.println("False Positive (FP): " + FP);
        System.out.println("False Negative (FN): " + FN);
        System.out.println("F1-Score: " + f1Score);
    }

    // Method to create a confusion matrix
    public static int[][] createConfusionMatrix(int[] actual, int[] predicted) {
        int[][] confusionMatrix = new int[2][2]; // Binary classification
        for (int i = 0; i < actual.length; i++) {
            if (actual[i] == 1 && predicted[i] == 1) {
                // True Positive
                confusionMatrix[1][1]++;
            } else if (actual[i] == 0 && predicted[i] == 0) {
                // True Negative
                confusionMatrix[0][0]++;
            } else if (actual[i] == 0 && predicted[i] == 1) {
                // False Positive
                confusionMatrix[0][1]++;
            } else if (actual[i] == 1 && predicted[i] == 0) {
                // False Negative
                confusionMatrix[1][0]++;
            }
        }
        return confusionMatrix;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
