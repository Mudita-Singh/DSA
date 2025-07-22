package java_codes.Bitwise_operators;

// calculate a power b

public class Q7 {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        System.out.println( power(a, b) );
    }

    public static int power(int a, int b) {
        int result = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                result *= a;
            }
            a *= a;
            b = b >> 1;
        }
        return result;
    }
}
