package java_codes.Recursion;

// reverse a number
// without any static variable

public class Recursion7 {
    public static void main(String[] args) {

        System.out.println(find(1234 ));
    }

    public static int find(int n){

        int digits = (int)(Math.log10(n)) + 1;

        return reverseHelper(digits , n);
    }

    public static int reverseHelper(int digit, int n){

        if(n < 10){
            return n;
        }

        return (int)(n%10 * Math.pow(10 ,digit-1)) + reverseHelper(digit-1 , n/10);
    }
}
