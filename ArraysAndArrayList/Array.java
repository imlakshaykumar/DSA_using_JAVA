package ArraysAndArrayList;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 543, 3]
        System.out.println(arr[3]);

        // input using for loop
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = scan.nextInt();
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        System.out.println(Arrays.toString(arr)); // [23, 45, 233, 543, 3]

        // for (int element : arr) { // for every element of array, print the element
        // System.out.print(element + " "); // here we access elements of the array not
        // the Index
        // }

        // System.out.println();

        // System.out.println(arr[5]); // index out of bound error
        // scan.close();

        String[] str = { "a", "b", "c", "d" };
        System.out.println(Arrays.toString(str));

        // Change value in an array
        int[] num = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

        /*
         * MultiDimensional Arrays
         */

        int[][] arr2D = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 }
        };
        System.out.println("\n2D array: ");
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col] + " ");
            }
            System.out.println();
        }

        // or we can print like this, or using for each loop

        for (int i = 0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
        }
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
