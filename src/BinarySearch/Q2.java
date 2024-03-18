package src.BinarySearch;



public class Q2 {
    public static int countOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the last occurrence of 1
            if (arr[mid] == 1 && (mid == arr.length - 1 || arr[mid + 1] == 0)) {
                return mid + 1;
            }

            // If mid-element is 1, search in the right half
            else if (arr[mid] == 1) {
                left = mid + 1;
            }

            // If mid-element is 0, search in the left half
            else {
                right = mid - 1;
            }
        }

        return 0;  // No 1 found in the array
    }

    public static void main(String[] args) {
        int[] a = {0, 0, 0, 0, 1, 1};
        int result = countOnes(a);
        System.out.println("Output 1: " + result);
    }
}