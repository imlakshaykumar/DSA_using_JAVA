package BinarySearchAlgo.Questions;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 10, 8 };
        int m = 2;

        System.out.println(splitArray(arr, m));
    }

    static int splitArray(int[] arr, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            // In the end of the loop this willcontain the max item from the array
            end += arr[i];

        }

        // binary search
        while (start < end) {
            // try for the middle as potential ans

            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : arr) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray. then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end; // here start == end
    }
}
