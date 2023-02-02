package BinarySearchAlgo.Questions;

/*
 * find the position of an element in an Infinite array using Binary Search
 */
public class InfiniteArray {
    public static void main(String[] args) {
        // assume that this is the infinite array
        int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;

        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // find the range
        // first start with the box of size 2

        int start = 0;
        int end = 1;

        // condition for the targetto lie in the range
        // till your target element is greater than the end, keep doubling the size
        // when you target element is less than end then it means out target lies in
        // between the range of that start and end

        while (target > arr[end]) {
            int temp = end + 1; // this is my new start

            // double the box value
            // end = previousEnd + (size of box * 2)
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return find(arr, target, start, end);
    }

    static int find(int[] arr, int target, int start, int end) {
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
}
