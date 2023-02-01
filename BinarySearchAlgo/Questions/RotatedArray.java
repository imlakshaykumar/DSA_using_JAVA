package BinarySearchAlgo.Questions;

/*
 * Search In Rotated Sorted Array
 * 
 * Roated Array: 
 * eg. [1,2,3,4,5]; => after 1 rotation => [5,1,2,3,4] => after 2 rotation => [4,5,1,2,3]
 * 
 * Approach 1
 * 
 * -> Find the pivot in the array (pivot: from where this particular thing started to change)
 * for example: in the above array, pivit element is 5
 * 
 * Pivit: element from where your next numbers are ascending
 * eg. [1,2,3,4,5] => [3,4,5,1,2] => 5 (pivot element) (pivot: largest number always)
 * 
 * -> Search in first half => simple binary search => from 0 to pivot
 * -> otherwise, search in second half => from pivot + 1 till end
 * 
 * Case 1
 * How to find pivot => when we know that the mid > (mid + 1) => pivot
 * 
 * Case 2
 * if mid < (mid - 1) => then (mid - 1) is the pivot element
 *
 * Case 3
 * start element >= mid element => eg. [4, 5, 6, 3, 2, 1, 0] => start = 4; mid = 3;
 * In this case, alll the elements from mid will be smaller than start. Hence, we can ignore all these elements since we are 
 * looking for the peak (largest element) => then end = (mid - 1)
 * 
 * Case 4
 * start element < mid element => eg. [3, 4, 5, 6, 2, 1] => start = 3; mid = 5
 * In this case, start = (mid + 1)
 * 
 * 
 * 
 */

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findPivot(arr)); // 3 (index)
    }

    // Pivot Binary Search:
    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        // if you dont have a pivot, it means that the array is not rotated
        if (pivot == -1) {
            // then just do normal binary search
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // if pivot is found, you have to found 2 asc sorted arrays
        if (arr[pivot] == target) {
            return pivot;
        } else if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // this will not work for duplicate values
    // return the index of the pivot element
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) { // make sure this doesn't go out of bound
                return mid; // found the ans
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // find pivot element with duplicates
    static int findPivotWithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) { // make sure this doesn't go out of bound
                return mid; // found the ans
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates

                // NOTE: what if these elements at start and end were the pivot??
                // check if start if pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
