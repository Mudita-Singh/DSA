package java_codes.Recursion;

// Fibonacci series
// using recursion

public class Recursion1 {
    public static void main(String[] args) {
        System.out.println( fibo(6 ));
    }

    public static int fibo( int n){
        if(n<2){
            return n;
        }

        return fibo(n-1)+ fibo(n-2);
    }


}
