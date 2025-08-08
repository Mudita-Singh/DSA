package java_codes.Recursion;

// all the possible permutation from a string "abc"
// using recursion
// storing in ArrayList

import java.util.ArrayList;

public class Recursion30 {
    public static void main(String[] args) {
        ArrayList<String> result = permutation("abc", "");
        System.out.println(result);

    }

    public static ArrayList<String> permutation(String up, String p) {
        ArrayList<String> list = new ArrayList<>();

        if (up.isEmpty()) {
            list.add(p); // Add the complete permutation to the list
            return list;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            list.addAll(permutation(up.substring(1), f + ch + s));
        }

        return list;
    }

}
