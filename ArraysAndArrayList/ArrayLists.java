package ArraysAndArrayList;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayLists {
    public static void main(String[] args) {
        // Creating an integer array
        int[] arr = { 1, 2, 3, 4, 5 };

        // Using Array.stream() to convert array into stream
        IntStream stream = Arrays.stream(arr);

        // Displaying elements in Stream
        stream.forEach(str -> System.out.print(str + " "));

        System.out.println();

        // String array
        String[] s = { "Hello", "world" };
        Stream<String> stringStream = Arrays.stream(s);

        stringStream.forEach(str -> System.out.print(str + " "));

        System.out.println();

        /*------------------OptionalInt getAsInt() method in java------------------------*/

        // Create an OptionalInt instance
        OptionalInt opInt = OptionalInt.of(45);

        System.out.println("OptionalInt: " + opInt.toString());

        // get value in this instance using getAsInt() method
        System.out.println("Value of OptionalInt: " + opInt.getAsInt());

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // System.out.println(list); // we can print arraylist like this

        // System.out.println();

        // list.set(0, 99); // change the value of index 0 to 99
        // System.out.println(list);

        // // System.out.println(list.contains(3)); //true

        // System.out.println();

        // for (int i = 0; i < 5; i++) {
        // System.out.print(list.get(i) + " "); // pass index here, list[index] syntax
        // will not work here
        // }
        // System.out.println();

        // // Multi ArrayList
        // ArrayList<ArrayList<Integer>> listMulti = new ArrayList<>();

        // // initialization
        // for (int i = 0; i < 2; i++) {
        // listMulti.add(new ArrayList<>());
        // }
        // listMulti.add(0, list);
        // System.out.println(listMulti);

        // // add element by scanner in Multi ArrayList
        // // for (int i = 0; i < 3; i++) {
        // // for (int j = 0; j < 3; j++) {
        // // list.get(i).add(scan.nextInt());
        // // }
        // // }
    }
}
