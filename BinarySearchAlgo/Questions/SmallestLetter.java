package BinarySearchAlgo.Questions;

/**
 * SmallestLetter.java
 * 
 * Find smallest letter Greater than Target
 * 
 * NOTE: letters wrap around
 * for example: if target = 'z' and letters = {'a', 'b'} then the output is 'a';
 * 
 * meaning, if there are no letters present in the array which is greater than
 * the target then return start (first index)
 */
public class SmallestLetter {

    public static void main(String[] args) {
        char[] arr = { 'c', 'f', 'j' };
        char target = 'a';

        char ans = smallest(arr, target);

        // here there is not element present in the array which is greater than 'j' then
        // it simply return first index of the array
        System.out.println(ans); // 'c'

    }

    static char smallest(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }

        // if (start == arr.length) {
        // start = 0;
        // }
        // return arr[start];
        return arr[start % arr.length];
    }
}