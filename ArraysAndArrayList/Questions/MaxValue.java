package ArraysAndArrayList.Questions;

import java.util.Arrays;

/**
 * MaxValue
 * Find the maximum value of an Array
 */
public class MaxValue {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 9, 18 };
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Maximum value in this array is: " + max(arr));

        // Maximum value in the range of Index 1 to 3, means (between value 3 and 9)
        // System.out.println(maxRange(arr, 1, 3));
    }

    // imagine array is not empty
    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0]; // now compare all the remaining values with maxVal
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // if we want to find maximum value in certain range
    // we can also work with the edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end) {
        if (end < start) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int maxVal = arr[start];
        // now compare all the remaining values with maxVal
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
