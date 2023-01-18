package LinearSearchAlgo.Questions;

import java.util.Arrays;

/*
 * SearchIn2D
 * Searching in 2D array
 */
public class Search2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 }
        };
        int target = 56;

        int[] ans = search2D(arr, target);

        System.out.println("2D array: ");
        for (int[] element : arr) {
            System.out.println(Arrays.toString(element));
        }

        System.out.println("Target: " + target);

        System.out.print("Found at index: ");
        System.out.println(Arrays.toString(ans));
    }

    static int[] search2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            // arr[row].length, means running a loop till the length of that row
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col }; // return the index of target
                    // return new int[], means we are declaring aa new array
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
