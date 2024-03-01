import java.util.Arrays;

public class Main {
    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        int temp = 0;

        /*
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
        
        boolean sorted;

        do {
            sorted = false;

            for (int i = 0; i < size - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    sorted = true;
                }
            }
        } while(sorted);
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 1, 3, 12, 89, 55, 100, 77, 22, 10, 12};


        bubbleSort(nums);

        System.out.println(Arrays.toString(nums));
        
    }
}