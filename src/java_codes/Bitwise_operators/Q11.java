package java_codes.Bitwise_operators;

// find root of a number using newton - raphson method

public class Q11 {
    public static void main(String[] args) {

        int n = 40;
        System.out.println( find(n));
    }

    public static double find( int n ){

        double x = n;  // initially assume root to be n
        double root ;
        double error ;

        while(true){
            root = 0.5 * (x + (n/x)) ;  // newton raphson formula

            error = Math.abs(root - x);  // find the error

            if( error < 0.001 ){
                break ;     // break the loop when error is less than 0.001
            }

            x = root ;   // update assumed root (x) with more precise value
        }

        return root ;
    }
}
