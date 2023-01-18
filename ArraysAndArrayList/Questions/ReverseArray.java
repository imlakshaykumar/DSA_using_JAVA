package ArraysAndArrayList.Questions;

import java.util.Arrays;

/**
 * ReverseArray
 * Reversing an Array
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 18 };
        System.out.println("Array before reversing: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Array after reversing: " + Arrays.toString(arr));
        /*
         * we can also run/access other classes which is in same package
         * like this
         * SwapValue.main(args);
         * 
         * In this, we are running SwapValue code/class
         * output: (run the SwapValue code)
         * Array before swapping: [1, 3, 23, 9, 18]
         * Swap index 0 and 4
         * Array after swapping: [18, 3, 23, 9, 1]
         */
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // swap start and end
            // we can access the static method of other classes which is in same package,
            // like this:
            SwapValue.swap(arr, start, end);
            start++;
            end--;
        }
    }
}
