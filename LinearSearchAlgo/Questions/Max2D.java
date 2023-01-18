package LinearSearchAlgo.Questions;

import java.util.Arrays;

/*
 * MaxIn2D
 * Maximum number in 2D array
 */
public class Max2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 }
        };
        System.out.println("2D array: ");
        for (int[] element : arr) {
            System.out.println(Arrays.toString(element));
        }
        System.out.print("Maximum value: ");
        System.out.println(max2D(arr));
    }

    static int max2D(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        /*
         * // we can also use 'for-each' loop for this
         * for (int[] ints : arr) {
         * for (int element : ints) {
         * if (element > max) {
         * max = element;
         * }
         * }
         * }
         */
        return max;
    }
}
