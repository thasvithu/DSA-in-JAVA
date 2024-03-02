import java.util.Arrays;

public class Main {
    public static void selectionSort(int[] arr) {
        int temp = 0;
        int size = arr.length;
        
        for (int i = 0; i < size; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {6, 2, 5, 3, 9, 7, 1};

        selectionSort(nums);

        System.out.println(Arrays.toString(nums));
    }
}