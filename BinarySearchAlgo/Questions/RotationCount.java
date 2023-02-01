package BinarySearchAlgo.Questions;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(countRotations(arr)); // 4
    }

    static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        // if (pivot == -1) {
        // // array is not rotated
        // return 0;
        // }
        return pivot + 1;
    }

    // use this for non-duplicates
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
