package LinearSearchAlgo.Questions;

import java.util.Arrays;

/**
 * SearchInRange
 * Search in a certain Range
 */
public class SearchRange {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28 };
        int target = 14;

        System.out.println("Array: " + Arrays.toString(arr) + "\nTarget: " + target);
        System.out.println("Found at Index: " + searchRange(arr, target, 2, 5));
    }

    static int searchRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
