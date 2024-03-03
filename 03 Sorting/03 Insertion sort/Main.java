/**
 * Author: @vithu
 */
import java.util.Arrays;

public class Main {
    public static void insertionSort(int[] arr) {
        // Get the length of the array
        int size = arr.length;

        // Iterate through the array starting from the second element
        for (int i = 1; i < size; i++) {
            // Select the current element to be inserted into the sorted region
            int key = arr[i];

            // Initialize the index to the left of the current element
            int j = i - 1;

            // Shift elements greater than the key to the right
            // until the correct position for the key is found
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Insert the key into its correct sorted position
            arr[j + 1] = key;
        }
    }

    
    public static void main(String[] args) {
        // Example array to be sorted
        int[] nums = {9, 2, 8, 1, 7, 5, 3, 21, 12};

        // Perform Insertion Sort on the array
        insertionSort(nums);

        // Print the sorted array
        System.out.println(Arrays.toString(nums));
    }
}
