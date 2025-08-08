package java_codes.Recursion;

// return the total count of the permutations
// using recursion

public class Recursion31 {
    public static void main(String[] args) {

        System.out.println(permutation("", "abc"));
    }

    static int permutation(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            count = count + permutation(f + ch + s, up.substring(1));
        }

        return count;
    }
}
