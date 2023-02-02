package BinarySearchAlgo;

import java.util.Arrays;

/*
 * Binary Search in 2D
 *
 * Q1: Matrix is sorted row-wise and col-wise manner 
 * (every row is sorted and every col is sorted)
 * like this: 
 * 
 * [10, 20, 30, 40]
 * [15, 25, 35, 45]
 * [28, 29, 37, 49]
 * [33, 34, 38, 50] 
 * 
 * (we start searching from row 0 and last col)

 * Case 1: if element == target => ans found 
 * 
 * Case 2: if element < target => row++
 * 
 * Case 3: if element > target =>  col++
 * 
 * 
 * 
 * 
 * Q2: Search in a sorted matrix (Strictly sorted matrix)
 * 
 * [1, 2 ,3]
 * [4, 5, 6]
 * [7, 8, 9]
 * 
 * target = 6;
 * 
 * => take the middle col & perform binary search on it
 * Case 1: if element = target => ans found
 * 
 * Case 2: if element > target 
 * => // ignore rows after (below) it
 * 
 * Case 3: if element < target
 * => // ignore above rows
 * 
 * 
 * In the end, 2 rows are remaining:
 * [ 1, 2, 3, 4 ]
 * [ 5, 6, 7, 8 ]
 * 
 * => check whether the mid col you at contains the ans
 * 
 */
public class BinarySeach2D {

    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };

        System.out.println(Arrays.toString(search2D(arr, 37))); // [ 2, 2 ]

        int[][] newArr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(Arrays.toString(strictlySorted(newArr, 6))); // [ 1, 2 ]
    }

    // Q1
    // return the index of target element
    static int[] search2D(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return new int[] { row, col };
            }

            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }

    // Q2
    // return the index of target
    static int[] strictlySorted(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty

        if (rows == 1) {
            return binarySeach(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop until 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true, it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[] { mid, cMid };
            } else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have 2 rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] { rStart, cMid };
        }

        // Search in the 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySeach(matrix, rStart, 0, cMid - 1, target);
        }
        // Search in the 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySeach(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // Search in the 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySeach(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return binarySeach(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

    // search in the row provided between the cols provided
    static int[] binarySeach(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }

            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }
}
