/**
 * Author: @vithu
 */
import java.util.Arrays;

public class Main {
    public static void bubbleSort(int[] arr) {
        // Get the length of the array
        int size = arr.length;
        // Temporary variable for swapping elements
        int temp = 0;

        /*
        // Original implementation using nested loops
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

                System.out.print(j + " ");
            }
            System.out.println();
        }
        */

        // Optimized implementation using a do-while loop
        boolean sorted;

        do {
            sorted = false;

            // Iterate through the array and perform swaps
            for (int i = 0; i < size - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap elements if they are in the wrong order
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    // Set sorted to true to indicate that a swap occurred
                    sorted = true;
                }
            }
        } while(sorted);
    }

    
    public static void main(String[] args) {
        // Example array to be sorted
        int[] nums = {2, 7, 1, 3, 12, 89, 55, 100, 77, 22, 10, 12};

        // Perform Bubble Sort on the array
        bubbleSort(nums);

        // Print the sorted array
        System.out.println(Arrays.toString(nums));
    }
}
