package java_codes.Recursion;

// find if a number is palindrome
// using recursion

public class Recursion8 {
    public static void main(String[] args) {
        System.out.println(find1(121));
    }

    public static boolean find1( int n ){
        return n == find2(n);
    }

    public static int find2(int n){

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
