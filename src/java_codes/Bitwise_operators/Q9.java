package java_codes.Bitwise_operators;

// find all the prime numbers less than n
// more optimized method

public class Q9 {
    public static void main(String[] args) {

        int n = 40 ;
        boolean[] arr = new boolean[n+1] ;
        search( n , arr);
    }

    public static void search( int n , boolean[] arr){

        for(int i = 2 ; i*i <= n ; i++){
            if(!arr[i]){
                for(int j = i*2 ; j <= n ; j=j+i){
                    arr[j] = true;
                }
            }
        }

        for(int i = 2 ; i <= n ; i++){
            if(!arr[i]){
                System.out.print(i + " ");
            }
        }
    }
}
