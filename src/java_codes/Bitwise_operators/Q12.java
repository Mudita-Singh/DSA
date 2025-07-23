package java_codes.Bitwise_operators;

// find factors of a number
// more optimized way

public class Q12 {
    public static void main(String[] args) {
        find( 20);
    }

    public static void find(int n){

        for( int i = 1 ; i <= Math.sqrt(n) ; i++){
            if( n%i == 0){
                if(n/i == i){
                    System.out.print(i + " ");  // duplicate value like for n = 36 , i = n/i = 6
                }
                else{
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }
}
