package BinarySearchAlgo;

/**
 * BinarySearch
 * Binary Search Algorithm
 * 
 * Steps:
 * 1. Find the middle element
 * 2. Compare the middle element to the target, if target is less then middle
 * then search in the left side and if target is greater than the middlle
 * element then search in the right side of the array
 * 3. check if the middle element == target
 * 
 * 
 * if first element < last element then it is ascending sort array
 * else it is descending sort array
 */
public class BinarySearch {

    public static void main(String[] args) {
        // assume this is the sorted array; ascending (small to large)
        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans); // 10
    }

    // return the index
    // return -1, if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is ascending or descending
        boolean isAsc = arr[start] < arr[end];
        // if (arr[start]<arr[end]) {
        // isAsc = true;
        // } else {
        // isAsc = false;
        // }
        while (start <= end) {
            // find the middle element

            // int middle = (start + end) / 2; // might be possible that the
            // (start+end)exceeds the range of int in java, so the better way to do that is:
            int mid = start + (end - start) / 2;

            if (mid == target) {
                return mid;
            }

            if (isAsc) {
                // check if target is small, large or equal to the middle element
                if (target < arr[mid]) {
                    end = mid - 1;
                } else (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                // if the array is in descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else (target < arr[mid]) {
                    start = mid + 1;
                }
            }

            // // check if target is small, large or equal to the middle element
            // if (target < arr[mid]) {
            // end = mid - 1;
            // } else if (target > arr[mid]) {
            // start = mid + 1;
            // } else {
            // // target == mid (ans found)
            // return mid; // if this is not the case then the target value is not in the
            // array
            // }
        }
        return -1;
    }
}