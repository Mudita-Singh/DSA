package java_codes.Basic_codes;

// swap using 3 and 2 variables

public class Q1 {
    public static void main( String[] args ){

        int a = 10;
        int b = 20;

        // 2 variables
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

        // using 3 variables

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

        // using XOR operator

        a = a ^ b;    // 01010 ^ 10100
        b = a ^ b;    // 11110 ^ 10100
        a = a ^ b;    // 11110 ^ 01010

        System.out.println(a);
        System.out.println(b);


    }
}
