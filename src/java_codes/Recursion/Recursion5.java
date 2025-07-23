package java_codes.Recursion;

// find the summation of all the digits in a number

public class Recursion5 {
    public static void main(String[] args) {
        System.out.println(find(1342));
    }

    public static int find(int n){
        if( n == 0){
            return 0 ;
        }

        return find(n/10) +( n % 10);

    }
}
