package LinearSearchAlgo;

import java.util.Arrays;

/**
 * LinearSearch
 * Linear search Algorithm
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        int target = 19;

        int ans = linearSearch(nums, target);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target + ", Index: " + ans);
    }

    // search in the array, return the Index if item found
    // otherwise if item not found, return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for the element at every Index if it is equal to target
            int element = arr[index];
            if (element == target) {
                return index;

                // if we want to return the element
                // return element;
            }
        }

        /*
         * // for returning the element we can also use for each loop, like this:
         * for (int element : arr) {
         * // check of element at every index if it is equal to target
         * if (element == target) {
         * return element;
         * }
         * }
         */

        // this line will execute if none of the return statement above have executed
        // hence target not found
        return -1;
    }
}
