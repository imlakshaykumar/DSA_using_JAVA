package BinarySearchAlgo.Questions;

/*
 * Mountain Array: once it go up and after certain point it goes down 
 * for example: 0,1,3,2,1,0
 * first, it will go up till 3 (0,1,3) and then after 3 it goes down (3,2,1,0)
 * so the peek element is 3 
 * 
 * Find the Peak index in a Mounatian Array
 */
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0 };
        System.out.println(peakIndex(arr));
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
}
