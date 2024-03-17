public class Main {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            
            //print the left sub array
            System.out.println("\n\n*LEFT SUB ARRAY");
            for (int i = left; i <= mid; i++)
                System.out.print(arr[i] + " ");

            //print the right sub array  
            System.out.println("\n\n--RIGHT SUB ARRAY");
            for (int i = mid + 1; i <= right; i++)
                System.out.print(arr[i] + " ");
            

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int lSize = mid - left + 1;
        int rSize = right - mid;
    
        int[] lArr = new int[lSize];
        int[] rArr = new int[rSize];
    
        // Copy the left array elements
        for (int i = 0; i < lSize; i++) {
            lArr[i] = arr[left + i];
        }
    
        // Copy the right array elements
        for (int i = 0; i < rSize; i++) {
            rArr[i] = arr[mid + 1 + i];
        }
    
        int i = 0;
        int j = 0;
        int k = left;
    
        // Merge the two subarrays
        while (i < lSize && j < rSize) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } 
            else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
    
        // Copy the remaining elements of left subarray, if any
        while (i < lSize) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
    
        // Copy the remaining elements of right subarray, if any
        while (j < rSize) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
    


    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 4, 6, 2};

        System.out.println("Before sorting");
        for(int i : nums)  
            System.out.print(i + " ");


        mergeSort(nums, 0, nums.length - 1);

        System.out.println("\n\nAfter sorting");
        for(int i : nums) 
            System.out.print(i + " ");
    }
}