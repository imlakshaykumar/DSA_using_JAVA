package ArraysAndArrayList;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list); // we can print arraylist like this

        System.out.println();

        list.set(0, 99); // change the value of index 0 to 99
        System.out.println(list);

        // System.out.println(list.contains(3)); //true

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " "); // pass index here, list[index] syntax will not work here
        }
        System.out.println();

        // Multi ArrayList
        ArrayList<ArrayList<Integer>> listMulti = new ArrayList<>();

        // initialization
        for (int i = 0; i < 2; i++) {
            listMulti.add(new ArrayList<>());
        }
        listMulti.add(0, list);
        System.out.println(listMulti);

        // add element by scanner in Multi ArrayList
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // list.get(i).add(scan.nextInt());
        // }
        // }
    }
}
