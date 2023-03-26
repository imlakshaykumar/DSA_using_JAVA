package BubbleSort;

import java.util.Arrays;

/**
 * BubbleSort
 * In this, we compare adjacent elements
 * If item that is compared with adjacent element is greater or smaller, Swap
 * that element with compared element
 * 
 * With the first pass through the array, the largest element came to the end
 * similary, with other passes, like this:
 * 
 * 
 * eg. 3, 2, 1, 5, 4 => 2, 3, 1, 5, 4 => 2, 1, 3, 5, 4 => 2, 1, 3, 4, 5
 * Here 5(largest element) came at the end of the array. Similarly with other
 * cases
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 2, 3 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        // run the steps n-1 times

        // if no swap is occuring then your array is sorted
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            // for each step, ma item will come at the last respective index
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // if you did not swap for a particular value of i, it means the array us sorted
            // hence stop the program
            if (!swapped) {
                break;
            }
        }
    }
}