package java_codes.Basic_codes;

// reverse a number

public class Q8 {
    public static void main(String[] args){
        int a = 1536;
        int reverse = 0 ;

        while(a != 0){
            int b = a % 10;
            reverse = reverse*10 + b;
            a = a/10;
        }

        System.out.println(reverse);
    }
}
