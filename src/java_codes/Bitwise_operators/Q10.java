package java_codes.Bitwise_operators;

public class Q10 {
    public static void main(String[] args) {
        int n = 40;  // value
        int p = 3;   // precision

        System.out.println(find(n , p));

    }
    public static double find(int n , int p){

        int start = 0;
        int end = n;
        double root = 0.0;

        // binary search  // complexity O(logn)
        while(start<=end){

            int mid = start + (end - start)/2 ;

            if( (mid*mid) == n ){
                return mid;   // in case of perfect square
            }
            else if( mid*mid <= n){
                root = mid;      // store floor value
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        double incr = 0.1;

        for(int i = 0 ; i < p ; i++){       //outer loop will run for p times
            while (root * root <= n) {      // inner loop will run 10 times per precision
                root += incr;               // so total iteration will be approx 10*p that is complexity - o(p)
            }
            root -= incr;  // go one step back
            incr /= 10;
        }
        return root;     // overall complexity will be O( logn + p ) but we will ignore p
    }                    // because p is btw 0 and 10 ( a fixed number ) but logn depends on input size
}                        // logn will be a larger value for a large n
                         // therefore , complexity = O( logn )