package java_codes.Basic_codes;

// check whether a number is armstrong

public class Q6 {
    public static void main(String[] args){
        int a = 153;
        System.out.println( checkArmstrong(a));
    }

    public static boolean checkArmstrong( int a ){

        // check digits
        int count = String.valueOf(a).length();

        int sum = 0;
        int original = a;

        while( a != 0){
            int digit = a % 10;
            sum += Math.pow(digit , count);
            a = a/10;
        }

        return sum == original;

    }
}
