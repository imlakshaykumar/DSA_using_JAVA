package BinarySearchAlgo.Questions;

import java.util.Arrays;

/*
 * Find the first and last position of elements
 */
public class FirstandLastPosition {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int target = 8;

        int[] ans = searchRange(arr, target);

        System.out.println(Arrays.toString(ans)); // [3,4]
    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = { -1, -1 };

        // check for first occurence of target first

        // int start = search(arr, target, true);

        // int end = search(arr, target, false);

        // ans[0] = start;
        // ans[1] = end;

        ans[0] = search(arr, target, true);

        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }

        return ans;
    }

    // this function return the index value of the target
    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
