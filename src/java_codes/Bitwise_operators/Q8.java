package java_codes.Bitwise_operators;

// find xor of all the numbers btw a and b

public class Q8 {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        int ans = xor(b)^xor(a-1);

        System.out.println(ans);
    }

    public static int xor( int n ){
        if( n % 4 == 0){
            return n ;
        }
        if( n % 4 == 1){
            return 1;
        }
        if( n % 4 == 2){
            return n+1;
        }
        if( n % 4 == 3){
            return 0;
        }

        return -1 ;
    }
}
