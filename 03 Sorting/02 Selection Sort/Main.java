/**
 * Author: @vithu
 */
import java.util.Arrays;

public class Main {
    public static void selectionSort(int[] arr) {
        // Temporary variable for swapping elements
        int temp = 0;
        
        // Get the length of the array
        int size = arr.length;

        // Iterate through the array for each pass
        for (int i = 0; i < size; i++) {
            // Assume the current index is the minimum
            int minIndex = i;

            // Find the index of the minimum element in the unsorted region
            for (int j = i + 1; j < size; j++) {
                // Check if a smaller element is found
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted region
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    
    public static void main(String[] args) {
        // Example array to be sorted
        int[] nums = {6, 2, 5, 3, 9, 7, 1};

        // Perform Selection Sort on the array
        selectionSort(nums);

        // Print the sorted array
        System.out.println(Arrays.toString(nums));
    }
}
