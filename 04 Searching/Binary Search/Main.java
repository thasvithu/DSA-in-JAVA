import java.util.Arrays;

public class Main {
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

    
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                end = mid - 1;
            else 
                start = mid + 1;
        }
        return -1;
    }

    public static int binaryRec(int[] arr, int target, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                return binaryRec(arr, target, mid + 1, end);
            }
            else {
                return binaryRec(arr, target, start, mid - 1);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 9, 7, 8, 2, 66, 12};
        int target = 66;
        Arrays.sort(nums);

        int result = binarySearch(nums, target);

        if (result != -1)
            System.out.println("Element found at index : " + result);
        else
            System.out.println("Element Not Found");


        System.out.println("Search 66 : " + binaryRec(nums, 6, 0, nums.length - 1));
    }
}