package BinarySearchAlgo.Questions;

/*
 * Search in the Mountain Array
 * (Find in Mountain Array)
 */
public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 2, 1 };
        int target = 3;

        System.out.println(search(arr, target)); // 2
    }

    static int search(int[] arr, int target) {
        int peak = peakIndex(arr);
        int firstTry = binarySearch(arr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }

        // try to search in second half
        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // you are in decreasing part of the array
                // this may be the ans, but look at left,
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in ascending part of the array
                start = mid + 1; // 'coz we know that mid + 1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2
        // check above
        // start and end are always trying to find max element in the above 2 checks
        // hence, they are pointing to just one element, that is the max one because
        // that is what the checks says

        // At every point of time for start and end, they have the best possible ans
        // till that time and if we are saying that only one item is remaining, hence
        // cuz of above line that is the bestpossible ans

        return start;
        // or return end cuz they both are equal
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        // find whether the array is ascending or descending
        boolean isAsc = arr[start] < arr[end];
        // if (arr[start]<arr[end]) {
        // isAsc = true;
        // } else {
        // isAsc = false;
        // }
        while (start <= end) {
            // find the middle element

            // int middle = (start + end) / 2; // might be possible that the
            // (start+end)exceeds the range of int in java, so the better way to do that is:
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                // check if target is small, large or equal to the middle element
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                // if the array is in descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

            // // check if target is small, large or equal to the middle element
            // if (target < arr[mid]) {
            // end = mid - 1;
            // } else if (target > arr[mid]) {
            // start = mid + 1;
            // } else {
            // // target == mid (ans found)
            // return mid; // if this is not the case then the target value is not in the
            // array
            // }
        }
        return -1;
    }
}
