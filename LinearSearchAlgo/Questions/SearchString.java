package LinearSearchAlgo.Questions;

/**
 * SearchInString
 * Searching in a String
 */
public class SearchString {
    public static void main(String[] args) {
        String name = "Lakshay";
        char target = 'k';

        System.out.println("String: " + name + "\nTarget: " + target);
        System.out.println("Target, present in String? " + search(name, target));
        // System.out.println(search(name, target));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }

        // we can also use for each here,
        /*
         * for (char ch : str.toCharArray()) {
         * if (ch == target) {
         * return true;
         * }
         * }
         */
        return false;
    }
}