package java_codes.Bitwise_operators;

// Use the binary representation of n
// For every bit set to 1 from right to left, add the corresponding power of 5

public class Q3 {
    public static void main(String[] args) {
        System.out.println( search(3));
    }

    public static int search(int n) {
        int number = 0;
        int base= 5;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            number = number + last * base ;
            base = base * 5;
        }

        return number ;
    }

}
