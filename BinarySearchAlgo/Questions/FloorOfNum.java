package BinarySearchAlgo.Questions;

/*
 * Find the greatest no. in th array which is smaller or equal to the target element
 * 
 * eg: if target is 15, 
 * then find the number which is equal to or greater than 15 which is 15 (equal) or 14 (smaller)
 */
public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 14, 16, 18, 22, 45, 89 };
        int target = 15;
        int ans = floorNum(arr, target);

        System.out.println(ans);
    }

    static int floorNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
