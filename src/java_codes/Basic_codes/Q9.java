package java_codes.Basic_codes;

// check for palindrome or not

public class Q9 {
    public static void main(String[] args){

        int a = 121;
        int original = a;
        int reverse = 0 ;

        while(a != 0){
            int b = a % 10;
            reverse = reverse*10 + b;
            a = a/10;
        }

        System.out.println( original == reverse );
    }
}
