package ArraysAndArrayList.Questions;

import java.util.Arrays;

/**
 * SwapValue
 * Swap value in an arrays
 */
public class SwapValue {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 18 };
        System.out.println("Array before swapping: " + Arrays.toString(arr));

        System.out.println("Swap index 0 and 4");
        swap(arr, 0, 4); // swap the value at index 0 and 4 which is 1 at index 0 and 18 at index 4

        System.out.println("Array after swapping: " + Arrays.toString(arr));
        // System.out.println(Arrays.toString(arr)); // { 18, 3, 23, 9, 1 }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}