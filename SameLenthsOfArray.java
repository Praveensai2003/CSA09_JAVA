import java.util.Arrays;

public class EqualizeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        // Check if arrays have equal length
        if (array1.length != array2.length) {
            // Determine the length of the smallest array
            int minLength = Math.min(array1.length, array2.length);

            // Make both arrays equal in length using Arrays.copyOf()
            if (array1.length < array2.length) {
                array2 = Arrays.copyOf(array2, minLength);
            } else {
                array1 = Arrays.copyOf(array1, minLength);
            }

            System.out.println("\nArrays after equalizing lengths:");
            System.out.println("Array 1: " + Arrays.toString(array1));
            System.out.println("Array 2: " + Arrays.toString(array2));
        } else {
            System.out.println("\nArrays already have equal lengths.");
        }
    }
}

